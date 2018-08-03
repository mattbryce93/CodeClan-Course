const makeRequest = function(url, callback){
  const request = new XMLHttpRequest();
  request.open("GET", url);
  request.addEventListener('load', callback);
  request.send();
};

const requestComplete = function(response){
  const json = JSON.parse(response.target.responseText);
  if(json.length === 0){
    console.log("This is a Crime Free Place... Promise... Bring your family here!");
  } else {
    displayGenderChart(json);
    displaySearchReasonChart(json);
  }
}

const displayGenderChart = function(json){
  const maleSearches = _.sumBy(json, {gender: 'Male'});
  const femaleSearches = _.sumBy(json, {gender: 'Female'});
  const nullSearches = _.sumBy(json, {gender: null});
  const chartData = google.visualization.arrayToDataTable([
    ['Gender', 'Count'],
    ['Male', maleSearches],
    ['Female', femaleSearches],
    ['Undefined', nullSearches]
  ]);
  const options = {
    title: "Searches by Gender",
    pieHole: 0.4,
  };
  const genderChart = new google.visualization.PieChart(document.getElementById('genderchart'));
  genderChart.draw(chartData, options);
};

const displaySearchReasonChart = function(json){
  uniqReasons = _.chain(json).map('object_of_search').uniq().value();
  results = {};
  for(var reason of uniqReasons){
    reasonCount = _.sumBy(json, {object_of_search: reason});
    results[reason] = reasonCount;
  };
  const dataArray = [['Reason for Search', 'Total Count']];
  for(var reason of uniqReasons){
    dataArray.push([reason, results[reason]]);
  };
  const chartData = google.visualization.arrayToDataTable(dataArray);
  const options = {
    chart: {
            title: 'Searches by Reason'
          },
          bars: 'horizontal'
  };
  const reasonChart = new google.charts.Bar(document.getElementById('reasonchart'));
  reasonChart.draw(chartData, google.charts.Bar.convertOptions(options));
};

const app = function(){
  google.charts.load("current", {packages:["corechart"]});
  google.charts.load('current', {'packages':['bar']});

  const mapWrapper = new MapWrapper('map', 51.508530, -0.076132, 10);

  mapWrapper.map.on('click', function(event){
    const lat = event.latlng.lat;
    const lng = event.latlng.lng;
    const url = `https://data.police.uk/api/stops-street?lat=${lat}&lng=${lng}`;

    makeRequest(url, requestComplete);
  });

};

window.addEventListener('load', app);

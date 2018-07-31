const MapWrapper = function(container, coords, zoom){

  const osmLayer = new L.TileLayer("https://maps.wikimedia.org/osm-intl/{z}/{x}/{y}{r}.png");
  this.map = L.map(container).setView(coords, zoom).addLayer(osmLayer);
  this.map.on('click', function(event){
    let coords = [event.latlng.lat, event.latlng.lng];
    this.addMarker(coords);
  }.bind(this));
};

MapWrapper.prototype.addMarker = function (coords) {
  L.marker(coords).addTo(this.map);
};

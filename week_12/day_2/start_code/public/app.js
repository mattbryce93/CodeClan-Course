const app = function(){

  let coords1 = [55.8554, -3.1602];
  let coords2 = [55.857236,-3.166804];
  let zoom = 15;
  let container = 'main-map';

  const mainMap = new MapWrapper(container, coords1, zoom);
  mainMap.addMarker(coords1);
  mainMap.addMarker(coords2);

};


window.addEventListener('DOMContentLoaded', app);

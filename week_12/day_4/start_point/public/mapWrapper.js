const MapWrapper = function(element, lat, lng, zoom){
  const osmUrl='https://maps.wikimedia.org/osm-intl/{z}/{x}/{y}{r}.png';
  const osm = new L.TileLayer(osmUrl);

  this.map = L.map(element)
      .addLayer(osm)
      .setView([lat, lng], zoom);
};

MapWrapper.prototype.addMarker = function(lat, lng, text){
  L.marker([lat, lng])
    .bindPopup(text)
    .addTo(this.map);
};

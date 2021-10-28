app = (function () {
    var _module = "js/api.js";

    function _updateData(data) {

    }
    var markers;
    var bounds;

    function _initMap(data) {
        map = new google.maps.Map(document.getElementById('map'), {
            center: {
                lat: data.coord.lat,
                lng: data.coord.lon
            },
            zoom: 10
        });
        plotMarkers(data);
    }

    function plotMarkers(m) {
        markers = [];
        bounds = new google.maps.LatLngBounds();

        m.forEach(function (marker) {
            var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lng);

            markers.push(
                new google.maps.Marker({
                    position: position,
                    map: map,
                    animation: google.maps.Animation.DROP
                })
            );

            bounds.extend(position);
        });

        map.fitBounds(bounds);
    }
})();
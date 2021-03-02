document.addEventListener('DOMContentLoaded', function () {
    let map = new google.maps.Map(document.getElementById("map"), {
        center: {lat: -34.397, lng: 150.644},
        zoom: 8,
    });
    document.getElementById('submitButton').addEventListener("click", async function () {
        let input = document.getElementById('input').value;
        const url = 'https://maps.googleapis.com/maps/api/geocode/json?address=' + input + '&key=AIzaSyD1Oy37hJ9cUavYEqmMBNVhluwAX_A4HQg';
        const response = (await fetch(url, {
            method: 'GET',
            mode: "cors",
            cache: "no-cache",
            credentials: "same-origin",
            redirect: "follow",
            referrerPolicy: "no-referrer",
        })).json();
        response.then(data => {
            console.log(data.results)
            let lat = data.results[0].geometry.location.lat;
            let lng = data.results[0].geometry.location.lng;
            if (data.results !== 'OK'){
                var myModal = new bootstrap.Modal(document.getElementById('myModal'), options)
            }

            function initMap() {
                const myLatLng = {lat: lat, lng: lng};
                const map = new google.maps.Map(document.getElementById("map"), {
                    zoom: 15,
                    center: myLatLng,
                });
                new google.maps.Marker({
                    position: myLatLng,
                    map,
                    title: "Hello World!",
                });
            }

            initMap();
        })
    });
});

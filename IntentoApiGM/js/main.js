var file;
file = new File(["puntos"],"puntos.txt")

function initMap() {
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 18,
    center: { lat: 43.4133334847664, lng: -3.4095486931606347 },
    mapTypeId: "terrain",
  });

  // Define the LatLng coordinates for the polygon's path.

  function punto (x, y){
    this.x = x;
    this.y = y;
  }


  function readFile(File) {
    let file = File;
  
    let reader = new FileReader();
  
    reader.readAsText(file);
  
    reader.onload = function() {
      console.log(reader.result);
    };
  
    reader.onerror = function() {
      console.log(reader.error);
    };

 let x = 43.4133334847664, y = -3.4085583921966487;
 let p = new punto(x, y)
  const puntos = [
    { lat: p.x , lng: y },
    { lat: 43.413334514902346 , lng: -3.4085592957658646 },
    { lat: 43.41364047869388 , lng: -3.4088041940363762 },
    { lat: 43.41421524510697 , lng: -3.409222887726748 },
    { lat: 43.4148750484474 , lng: -3.4094841390913206 },
    { lat:  43.4146637540669 , lng: -3.4080530220786045 },
    { lat: 43.41455354795924 , lng: -3.4079687805939485 },
    { lat: 43.41443056363944 , lng: -3.407855427919652 },
    { lat: 43.414097462596594 , lng: -3.4074005814023662 },
    { lat: 43.413485322951395 , lng: -3.4082808899972377 },
    { lat: 43.4133334847664 , lng: -3.4085583921966487 },
  ];

  // Construct the polygon.
  const pintarArea = new google.maps.Polygon({
    paths: puntos,
    strokeColor: "#FF0000",
    strokeOpacity: 0.8,
    strokeWeight: 2,
    fillColor: "#FF0000",
    fillOpacity: 0.35,
  });

  pintarArea.setMap(map);
}
}
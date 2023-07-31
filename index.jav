let vectors = [];
let amount = 8000;
let speed = 1;
let size = 10;

function setup() {
  createCanvas(windowWidth,windowHeight)
  background(10)
  
  stroke(200,200,200, 10)
  
  for ( var i = 0; i < amount; i++ ) {
    vectors.push(createVector(random(width),random(height)))
  }
}

function draw() {
  for ( vector of vectors) {
    let randomisation = noise(vector.x/99, vector.y/99) * TAU;
    
    vector.add(cos(randomisation),sin(randomisation))
    
    point(
      constrain(vector.x, 100, width-100),
      constrain(vector.y, 100, height-100)
    )
  }
}


var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");
var [x1, y1] = valores[0].split(" ");
var [x2, y2] = valores[1].split(" ");

var distancia = Math.sqrt(Math.pow((parseFloat(x2)-parseFloat(x1)),2.0)+Math.pow((parseFloat(y2)-parseFloat(y1)),2.0));

console.log((distancia).toFixed(4));
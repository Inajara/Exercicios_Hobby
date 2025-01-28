var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var raio = parseFloat(valores.shift());

var volume = (4.0/3.0)*3.14159*Math.pow(raio, 3.0);

console.log("VOLUME = "+(volume).toFixed(3));
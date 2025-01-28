var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var X = parseInt(valores.shift());
var Y = parseFloat(valores.shift());

var km = X/Y;

console.log((km).toFixed(3)+" km/l");
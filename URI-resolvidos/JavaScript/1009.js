var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");
var Nome = valores.shift();
var Sal = parseFloat(valores.shift());
var Ven = parseFloat(valores.shift());

console.log("TOTAL = R$ " + (Sal + (0.15 * Ven)).toFixed(2));
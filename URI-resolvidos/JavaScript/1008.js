var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");
var Numf = parseInt(valores.shift());
var Numh = parseInt(valores.shift());
var Numv = parseFloat(valores.shift());

console.log("NUMBER = " + Numf + "\n" + "SALARY = U$ " + (Numh*Numv).toFixed(2));

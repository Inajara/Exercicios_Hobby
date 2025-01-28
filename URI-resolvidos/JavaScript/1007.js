var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");
var A = parseInt(valores.shift());
var B = parseInt(valores.shift());
var C = parseInt(valores.shift());
var D = parseInt(valores.shift());

console.log("DIFERENCA = " + ((A*B)-(C*D)));

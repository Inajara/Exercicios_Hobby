var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");
var A = parseFloat(valores.shift());
var B = parseFloat(valores.shift());
var C = parseFloat(valores.shift());

console.log("MEDIA = " + (((A*2.0)+(B*3.0)+(C*5.0))/10.0).toFixed(1));

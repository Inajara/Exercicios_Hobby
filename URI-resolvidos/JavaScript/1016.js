var input = require('fs').readFileSync('stdin', 'utf8');

var valor = input.split("\n");

var distancia = parseInt(valor.shift());
var minutos = (60*distancia)/30;

console.log(minutos+" minutos");
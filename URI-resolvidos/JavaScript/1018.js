var input = require('fs').readFileSync('stdin', 'utf8');

var valor = input.split("\n");
var notas = parseInt(valor.shift());

console.log(notas);
console.log(parseInt((notas/100))+" nota(s) de R$ 100,00");
notas = notas%100;
console.log(parseInt((notas/50))+" nota(s) de R$ 50,00");
notas = notas%50;
console.log(parseInt((notas/20))+" nota(s) de R$ 20,00");
notas = notas%20;
console.log(parseInt((notas/10))+" nota(s) de R$ 10,00");
notas = notas%10;
console.log(parseInt((notas/5))+" nota(s) de R$ 5,00");
notas = notas%5;
console.log(parseInt((notas/2))+" nota(s) de R$ 2,00");
notas = notas%2;
console.log(parseInt((notas/1))+" nota(s) de R$ 1,00");
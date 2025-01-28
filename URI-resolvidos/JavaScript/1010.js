var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split("\n");
var item1 = linhas.shift().split(" ");
var idItem1 = item1.shift();
var qtdItem1 = item1.shift();
var valorItem1 = item1.shift();

var item2 = linhas.shift().split(" ");
var idItem2 = item2.shift();
var qtdItem2 = item2.shift();
var valorItem2 = item2.shift();

var total1 = qtdItem1*valorItem1;
var total2 = qtdItem2*valorItem2;
var soma = total1+total2;

console.log("VALOR A PAGAR: R$ "+(soma).toFixed(2));
var input = require('fs').readFileSync('stdin', 'utf8');

var [A, B, C] = input.split(" ");

var areat = (A*C)/2.0;
var areac = 3.14159*Math.pow(C, 2.0);
var areap = ((parseFloat(A)+parseFloat(B))*C)/2.0;
var areaq = Math.pow(B, 2.0);
var arear = A*B;

console.log("TRIANGULO: "+(areat).toFixed(3));
console.log("CIRCULO: "+(areac).toFixed(3));
console.log("TRAPEZIO: "+(areap).toFixed(3));
console.log("QUADRADO: "+(areaq).toFixed(3));
console.log("RETANGULO: "+(arear).toFixed(3));
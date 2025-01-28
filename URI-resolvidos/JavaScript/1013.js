var input = require('fs').readFileSync('stdin', 'utf8');

var [A, B, C] = input.split(" ");

var mab = (parseInt(A)+parseInt(B)+Math.abs(parseInt(A)-parseInt(B)))/2;
var mbc = (mab+parseInt(C)+Math.abs(mab-parseInt(C)))/2;

console.log((mbc)+" eh o maior");
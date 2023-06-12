
// 

/*var sum = 0;
for(var i = 1; i<=100; i++){
	sum += i; 
}
document.write("합계 : " + sum);
document.write("<br>");*/

 // 입력한 숫자까지 합을 구하세요 
 
/* var input = Number(prompt("숫자를 입력하세요","0"));
 var sum = 0;
for(var i = 1; i<=input; i++){
	sum += i; 
}
document.write("합계 : " + sum);
document.write("<br>");



*/

/*// 두수를 입력받아 입력받은수에서 입력받은 수까지의 합 구하기 

var num1 = Number(prompt("숫자1를 입력하세요"));
var num2 = Number(prompt("숫자2를 입력하세요"));


var sum = 0;

var a = num1; 
var a = num1>num2 ? num2:num1;

for(var i = a; i<=(num1+num2-a); i++){
	sum += i; 
}
document.write("합계 : " + sum);
document.write("<br>");*/

// 홀 수 합 
var num1 = Number(prompt("숫자1를 입력하세요"));
var num2 = Number(prompt("숫자2를 입력하세요"));


var sum = 0;

var a = num1; 
var a = num1>num2 ? num2:num1;

for(var i = a; i<=(num1+num2-a); i++){
	if(i%2!=0)	sum += i; 
}
document.write("합계 : " + sum);
document.write("<br>");




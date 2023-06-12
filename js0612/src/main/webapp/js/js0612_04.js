/*var num1 = prompt("숫자1를 입력하세요");
var num2 = prompt("숫자2를 입력하세요");


document.write("입력한 숫자 타입 : ",typeof(num1));

document.write("<br>");

document.write(Number(num1)+Number(num2));*/

var num1 = Number(prompt("숫자1를 입력하세요"));
var num2 = Number(prompt("숫자2를 입력하세요"));


document.write("입력한 숫자 타입 : ",typeof(num1));

document.write("<br>");

document.write(num1+num2);
// 두 수를 입력받아 큰수를 출력하세요 >> 

var result = num1>num2 ? num1:num2;
document.write("<br>");
document.write(result);
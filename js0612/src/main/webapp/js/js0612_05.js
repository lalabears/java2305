

var input = Number(prompt("숫자를 입력하세요","0"));


if(input>100){
	document.write("100보다 큼");
} else{
	document.write("100보다 작음");
}
document.write("<br>");
if(input%2==0){
	document.write("짝수");
} else{
	document.write("홀수");
}




/*
document.write("<br>");
var num1 = (prompt("숫자1를 입력하세요"));
var num2 = (prompt("숫자2를 입력하세요"));
document.write(num1+num2);
document.write("<br>");
document.write(num1-num2);
*/
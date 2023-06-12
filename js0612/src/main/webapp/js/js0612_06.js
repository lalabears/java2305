

// let const var 

var random = Math.floor(Math.random()*10)+1;

var input = Number(prompt("숫자를 입력하세요","0"));
if(input==random){
	document.write("당첨! <br> ");
}else{
	alert("오답입니다. 정답은 : " + random)
	// location.reload();
}
document.write("정답은 : ");


document.write(random);
document.write("<br>");
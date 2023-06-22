

function input(){
	// alert("ddd");
	var a = Number(prompt("1 숫자를 입력하세요 "));
	var b = Number(prompt("2 숫자를 입력하세요 "));
	
	add(a,b);
	sub(a,b);
}

function add(a, b){
	console.log(a+b);
	
}

function sub(a,b){
	console.log(a-b);
	
}
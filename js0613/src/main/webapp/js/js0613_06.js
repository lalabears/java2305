var interval;

function start(){
	interval = setInterval(function(){
		var today = new Date();
		var nowHour = today.getHours();
		var nowMin = today.getMinutes();
		var nowSec = today.getSeconds();
		var milisec = today.getMilliseconds();
		
		document.getElementById("h01").innerText = add(nowHour) +" : "+ add(nowMin) +" : "+ add(nowSec); 
		
	},1000);
	
}

function add(num){
	var result="";
	if (num<10){
		result = "0"+num;
		return result;
	}else{
		return num;
	}
	
}
	
function stop(){
		clearInterval(interval);
}
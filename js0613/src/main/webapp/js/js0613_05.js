
var cnt = 0;

var interval ; 
function setIn(){
	var htmlData = "";
	
	cnt++;
	htmlData+= "<tr><td>"+cnt+"</td></tr>";


	$("#t01").append(htmlData);
	interval = setInterval(function(){
		
		
/*	cnt++;
	htmlData+= "<tr><td>"+cnt+"</td></tr>";
	document.getElementById("t01").innerHTML = htmlData;
	*/
		
		
	},1000);
	
}


function setOut(){
	clearInterval(interval);
}
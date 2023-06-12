
// 구구단


		

var htmlData="<table>"

for(var i = 2; i<=9; i++){
	// document.write("["+i+" 단] <br>"); 
	htmlData += "<tr><td colspan='5'> [ "+i+ " 단]"+"</td></tr>";
	for(var j = 1; j<=9; j++){
	//	document.write(i+"*"+j+"=" + (i*j) +"  " );
	 htmlData += "<tr><td>"+i+"</td><td>*</td><td>"+j+"</td><td>=</td><td>"+(i*j)+"</td></tr>";
	}
	//document.write("<br>");
}
htmlData+="</table>";

document.write(htmlData);
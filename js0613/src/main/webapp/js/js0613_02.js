

function stuScore(){
	// alert("ddd");
	var name = prompt("이름을 입력하세요 ");
	var kor = Number(prompt("국어점수를 입력하세요 "));
	var eng = Number(prompt("영어점수를 입력하세요 "));
	var math = Number(prompt("수학점수를 입력하세요 "));
	
	var total=kor+eng+math;
	var avg=(total/3.0).toFixed(2); 
	
//	console.log(kor+eng+math);
//	console.log( ( (kor+eng+math)/3.0).toFixed(2) );
	
	var htmlData = "";

	htmlData +="<tr><td>"+name+"</td><td>"+kor+"</td><td>"+eng+"</td><td>"+math+"</td><td>"+total+"</td><td>"+avg+"</td></tr>";		


	//document.getElementById("tbody").innerHTML = htmlData;
	document.getElementById("tbody").append(htmlData);

}
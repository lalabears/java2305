
var htmlData = "";
//htmlData += '<h2>학생성적 프로그램</h2><table><colgroup><col width="8%"><col width="14%">	<col width="8%"><col width="8%"><col width="8%"><col width="10%"><col width="10%"><col width="7%"><col width="15%">	<col width="12%"></colgroup>';
//htmlData += "<tr><th>학번</th><th>이름</th><th>국어</th><th>영어</th>	<th>수학</th>	<th>합계</th>	<th>평균</th>	<th>등수</th>	<th>작성일</th><th>작성자</th></tr>";

var kor,eng,math,total, avg;

for(var i = 0 ; i< 10; i++){
	
	kor=Math.floor(Math.random()*20)+81;
	eng=Math.floor(Math.random()*20)+81;
	math=Math.floor(Math.random()*20)+81;
	total=kor+eng+math;
	avg=(total/3.0).toFixed(2); 
	htmlData +="<tr><td>1</td><td>홍길동</td><td>"+kor+"</td><td>"+eng+"</td><td>"+math+"</td><td>"+total+"</td><td>"+avg+"</td><td>1</td><td>2023-06-12</td><td>관리자</td></tr>";		
}

//htmlData+="</table>";

document.getElementById("tbody").innerHTML = htmlData;
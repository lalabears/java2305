
var openPop;

function idCheck(){
	// alert("open");
	openPop = window.open("idCheckForm.html","idck","width=350px, height=500px, resizable=no, scrollbars =no");
}


function dbIdCheck(){
	document.getElementById("span01").innerText = "입력한 아이디는 사용이 가능합니다.";
}

function idConfirm(){
	opener.document.getElementById("id").value =	document.getElementById("checkId").value;
	window.close();
	
}
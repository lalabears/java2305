
var openWin;

function popupOpen(){
	alert("자식창으로 값을 전달합니다");
	openWin = window.open("popup.html","popupform","width=350px, height=500px, resizable=no, scrollbars =no");
}
function sendValue(){
	openWin.document.getElementById("reValue").value =	document.getElementById("testInput").value
}

function popupSend(){
		alert("부모창으로 값을 전달합니다");

	opener.document.getElementById("receive").value = document.getElementById("send").value
	
}
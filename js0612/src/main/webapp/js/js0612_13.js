
function pop(){
	// alert("pop clicked");
	window.open("popup.html","pop1","width=400, height=600, top=0, left=0");
	
}

function dataDelete(){
	
	//alert("dataDelete() called");
	if(confirm("삭제하시겠습니까 ? ")){
		alert("게시글이 삭제되었습니다.");
	}else{
		alert("삭제가 취소되었습니다.");
		//기존페이지로.. 
	}
	
	
}
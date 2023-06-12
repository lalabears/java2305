
/*var arr = [30,"홍길동",true,31.25];

for(var i = 0 ; i<arr.length;i++){
	document.write(arr[i] + "<br>");
}*/



var arr1 = ["홍길동","유관순","이순신"];
var arr2 = ["강감찬","김구"];

var result = arr1.push("김유신");
for(var i = 0 ; i<arr1.length;i++){
	document.write(arr1[i] + "<br>");
}

for (var i of arr2){
    console.log(i);
}


document.write(arr1);
document.write("<br>");
document.write(result);
console.log(arr1);
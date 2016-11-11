fontSize();
function fontSize(){
	var w = window.innerWidth/10;
	var html = document.querySelector("html");
	html.style.fontSize = w + "px";
}
window.onresize = fontSize;


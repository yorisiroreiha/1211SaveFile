"use strict"
window.onload=function(){
	const images = document.querySelectorAll(".headerImage")
	let zIndexMax = 0 ;
	for( let i = 0 ; i < images.length ; i++ ){
		images[i].addEventListener("click",function(){
			this.style.zIndex=++zIndexMax;
		});
	}
}

const ol = document.getElementById("list") ;
const btn = document.getElementById("btn") ;
let count = 0 ;
btn.addEventListener("click",()=>{
    const li = document.createElement("li") ;
    li.textContent = "Item"+(++count) ;
    ol.appendChild(li);
})
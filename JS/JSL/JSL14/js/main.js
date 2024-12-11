window.onload=()=>{
    const hides = document.querySelectorAll(".secret");
    for(let hide of hides){
        hide.addEventListener("mouseover",()=>{
            hide.style.color = "blue" ;
        })
        hide.addEventListener("mouseout",()=>{
            hide.style.color = "darkcyan" ;
            hide.style.fontSize = "16px" ;
        })
        hide.addEventListener("click",()=>{
            hide.style.fontSize = "40px" ;
        })
    }
}
const array = [1, 2, 3, 2, 4, 3, 5, 1];
console.log(getUniqueArray(temp)); // [1, 2, 3, 4, 5]
sort=()=>{
    let temp = [];
    for( let i = 0 ; i < array.length ; i++ ){
        for( let j = 0 ; j < temp.size() ; j++ ){
            let count = 0 ;
            if(temp[j]==array[i]){count++}
            if(count==temp.size()){
                temp.add(array[i]);
            }
        }
    }

}
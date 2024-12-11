window.onload=function(){
    const table = document.getElementById("table") ;
    for( let i = 1 ; i <= 9 ; i++ ){
        const tr = document.createElement("tr") ;
        for( let j = 1 ; j <= 9 ; j++ ){
           const td = document.createElement("td") ;
           td.textContent = `${i}*${j}=` ;
           td.ans = i*j ;
           td.addEventListener("click",()=>{
            const userAns = window.prompt(td.textContent);
            if(userAns==td.ans){
                td.style.backgroundColor = "lightgreen" ;
            }else{
                td.style.backgroundColor = "pink" ;
            }   
            })
            td.addEventListener("mouseover",()=>{
                td.style.cursor='pointer' ;
            })
            
           tr.appendChild(td); 
        } 
        table.appendChild(tr);
    }

  };
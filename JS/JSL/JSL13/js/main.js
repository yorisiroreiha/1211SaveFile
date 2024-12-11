window.onload = () => {
    const result = document.getElementById("result");
    const fruits = document.querySelectorAll("[data-price]");
    for(let fr of fruits){
        fr.addEventListener("input",()=>{
            let sum = 0 ;
            for(let fru of fruits){
                sum += fru.value * fru.getAttribute("data-price");
            }
            result.textContent=sum+"円です" ;
        });
    }
  };
  
  
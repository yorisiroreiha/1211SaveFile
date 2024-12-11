window.onload=function(){
    const path="images/";
    const images=["cat1.jpg","cat2.jpg","cat3.jpg"];
    let index=0;
    const ele=document.getElementById("mainImage");
    const time = document.getElementById("time");
    setInterval(()=>{
      ele.src=path+images[++index % images.length];
    },1000);
    setInterval(()=>{
      time.textContent=index
    },1000);
  };
  
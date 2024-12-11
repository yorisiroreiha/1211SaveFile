"use strict";
document.addEventListener("DOMContentLoaded",()=>{
    const msg = document.getElementById("msg");
    const zip = document.getElementById("zip");
    const btn = document.getElementById("btn");
    const result = document.getElementById("result");

    btn.addEventListener("click",async ()=>{
        result.textContent=null;
        if(!/^[0-9]{3}-?[0-9]{4}$/.test(zip.value)){
            msg.textContent="ただしい郵便番号を入れてください";
            return ;
        }
        const zipcode = zip.value.replace("-","");
        msg.textContent ="通信中" ;
        const res = await fetch(`https://zipcloud.ibsnet.co.jp/api/search?zipcode=${zipcode}`);
        const data = await res.json();
        if(data.results===null){
            msg.textContent="存在しない郵便番号です" ;
        }
        for(let res of data.results){
            const table = document.createElement("table");
            let ele = `<tr><td>郵便番号</td><td>${res.zipcode}</td></tr>`;
          ele += `<tr><td>都道府県コード</td><td>${res.prefcode}</td></tr>`;
          ele += `<tr><td>都道府県名</td><td>${res.address1}</td></tr>`;
          ele += `<tr><td>市区町村名</td><td>${res.address2}</td></tr>`;
          ele += `<tr><td>町域名</td><td>${res.address3}</td></tr>`;
          ele += `<tr><td>都道府県名カナ</td><td>${res.kana1}</td></tr>`;
          ele += `<tr><td>市区町村名カナ</td><td>${res.kana2}</td></tr>`;
          ele += `<tr><td>町域名カナ</td><td>${res.kana3}</td></tr>`;
          table.innerHTML = ele;
          result.appendChild(table);
        }
        msg.textContent = "通信完了" ;
    });
})
'use strict';
window.onload=()=>{
	class Word{
		constructor(en,ja){
			this.en=en;
			this.ja=ja;
		}
		showInfo(){
			return `<td>${this.en}</td><td>${this.ja}</td>`;
		}
	}
	const inputs=document.querySelectorAll('input');	
	const btn=document.querySelector('#btn');	
	const total=document.querySelector('#total');	
	const table=document.querySelector('#table');	
	let list=[];
	//localStorageからwordsというキーがついた項目を取得
	const loadData=localStorage.getItem('words');
	//データがあれば
	if(loadData !== null){
    //取得したJSON形式のデータをオブジェクトの配列に変換
    const words = JSON.parse(loadData);
    //配列から1件ずつwordとして取り出す
    words.forEach((word)=>{
    //listにWordインスタンスを追加
    list.push(new Word(word.en,word.ja));
    });
    updateTable();
	}
	btn.addEventListener('click',()=>{
    const enValue = inputs[0].value.trim();
    const jaValue = inputs[1].value.trim();
    if (enValue === '' || jaValue === '') {
      alert('単語と意味を両方入力してください。');
      return;
    }
		let word=new Word(enValue,jaValue);
		list.push(word);
		inputs.forEach((input)=>{
      input.value='';
		});
		updateTable();
		//配列の単語リストをJSON形式に変換し、localStorageに保存
		localStorage.setItem('words',JSON.stringify(list));
	});
	function updateTable(){
		table.innerHTML='<tr><th>単語</th><th>意味</th></tr>';
    list.forEach((word)=>{
			let tr=document.createElement('tr');
			tr.innerHTML=word.showInfo();
			table.appendChild(tr);
    });
    total.textContent=`全${list.length}件`;
	}
	updateTable();
};
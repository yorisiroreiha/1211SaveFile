'use strict';
document.addEventListener('DOMContentLoaded',()=>{
    let firstCard = null ;
    let secondCard = null ;
    const msg = document.getElementById("msg");
    const startBt = document.getElementById("startBt");
  class Card{
    constructor(suit,num){
        this.suit = suit ;
        this.num = num ;
        this.front=`${suit}${num<10?"0":""}${num}.gif`
    }
  }
  const cards = [] ;
  const suits = ["s","d","h","c"] ;
  const nums = [1,2,3,4,5,6,7,8,9,10,11,12,13] ;
  for(let i = 0 ; i < suits.length ; i++ ){
    for( let j = 0 ; j < nums.length ; j++ ){
        let card = new Card(suits[i],nums[j]);
        cards.push(card);
    }
  }
  const cardgrid = document.getElementById("cardgrid");

  const initgrid = ()=>{
    for(let i = 0 ; i < cards.length ; i++ ){
        let div = document.createElement("div");
        let card = cards[i] ;
        //div.textContent = `${card.suit}:${card.num}` ;
        div.style.backgroundImage = `url(images/${card.front})` ;
        div.classList.add("card","back");
        div.onclick=flip ;
        div.num = card.num ;
        cardgrid.appendChild(div);
    }
  }
  startBt.addEventListener("click",()=>{
    msg.textContent = null ;
    startBt.textContent = "Start" ;
    startBt.classList.remove("clear");
    cardgrid.textContent=null;
    initgrid();
    shuffle();
    const music = new Audio('sound/m-art_Extra1.wav');
    music.volume = 1.0;
    music.play();
  })

  const shuffle = ()=>{
    let i = cards.length ;
    while(i){
        let index = Math.floor(Math.random()*i--);
        [cards[index],cards[i]] = [cards[i],cards[index]];
    }
  }

  const flip =(eve)=>{
    let div = eve.target ;
    if(!div.classList.contains("back") || secondCard !== null){
        return 
    }
    div.classList.remove("back");
    if(firstCard===null){
        firstCard = div ;
    }else{
        secondCard = div ;     
    }
    if(firstCard.num==secondCard.num){
        firstCard.classList.add("fadeout");
        secondCard.classList.add("fadeout");
        const music = new Audio('sound/m-art_True1.wav');
        music.volume = 1.0;
        music.play();
        [firstCard,secondCard] = [null,null] ;
    }else{
    setTimeout(()=>{
        firstCard.classList.add("back");
        secondCard.classList.add("back");
        [firstCard,secondCard] = [null,null] ;
    },1200);
    }
    setmsg();
  }
  const setmsg =()=>{
    let tempcount = document.querySelectorAll(".fadeout");
    let count = tempcount.length;
    if(52-count==0){
        msg.textContent = "888" ;
        startBt.textContent = "ReStart?" ;
        startBt.classList.add("clear") ;
        const music = new Audio('sound/m-art_Jingle15.mp3');
        music.volume = 1.0;
        music.play();
    }else{
        msg.textContent = `残り${52-count}枚です` ;
    }
  }
});
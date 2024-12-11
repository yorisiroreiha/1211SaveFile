'use strict';
document.addEventListener('DOMContentLoaded', () => {
  const size = 2; //盤面の大きさ
  const stage = document.getElementById('stage');
  const msgBox = document.getElementById('msg');
  const startBt = document.getElementById('startbtn');
  let panels; //stageの子要素のdivリストを保持
  let blankIdx; //現在の空のindexを保持
  stage.style.width = size * 80 + 'px';
  stage.style.gridTemplateColumns = `repeat(${size},1fr)`;

  const init = () => {
    //パネル要素をdiv要素として作成していく
    for (let i = 0; i < size * size; i++) {
      const panel = document.createElement('div');
      panel.posId = i;
      panel.textContent = i + 1;
      if (i === size * size - 1) {
        panel.textContent = '';
        panel.classList.add('blank');
        blankIdx = i;
      }
      panel.onclick = click;
      stage.append(panel);
    }
    //stageの子要素リストをpanelsに代入
    panels = stage.children;
  };
  
  startBt.addEventListener('click', () => {
    msgBox.textContent = null ;
    /****シャッフル****/
    for (let i = 0; i < size ** 4; i++) {
      const dir = Math.floor(Math.random() * 4); //0上,1下,2右,3左
      //上下左右のpos
      const targetPositions = [
        blankIdx - size,
        blankIdx + size,
        blankIdx + 1,
        blankIdx - 1,
      ];
      //乱数の結果から今回の交換位置を求める
      let pos = targetPositions[dir];
      //交換位置が範囲外だったら何もしない
      if (pos < 0 || pos >= size * size) {
        continue;
      }
      //そのposがblankパネルに隣接していたら
      if (isAdjacentToblank(pos)) {
        //交換処理
        swap(pos);
        check();
      }
    }
  });
  /****引数に入ってきたパネル番号がblankパネルと上下左右に隣接しているかを返す関数 */
  const isAdjacentToblank = (pos) => {
    //上がブランク
    if (pos - size === blankIdx) return true;
    //下がブランク
    if (pos + size === blankIdx) return true;
    //右がブランク
    if ((pos + 1) % size !== 0 && pos + 1 === blankIdx) return true;
    //左がブランク
    if (pos % size !== 0 && pos - 1 === blankIdx) return true;

    return false;
  };
  /***blankパネルと引数に入ってきたパネル番号の表示を交換する関数 */
  const swap = (pos) => {
    //引数に入ってきたposからblankパネルと交換する番号の入ったDOMを取得
    const numPanel = panels[pos];
    //blankIdxを指定してblankパネルDOMを取得
    const blankPanel = panels[blankIdx];
    //blankパネルの表示をnumPanelの数字にする
    blankPanel.textContent = numPanel.textContent;
    //blankパネルではなくなるのでクラスblankを削除する。
    blankPanel.classList.remove('blank');
    //numパネルはblankになるのでtextContentを空文字にする
    numPanel.textContent = '';
    //classとしてblankを付与
    numPanel.classList.add('blank');
    //blankのパネルが変わったのでblankIdxを更新しておく
    blankIdx = pos;
  };
  const click = (e) => {
    //クリックされた要素のposIdを取得
    const pos = e.target.posId;
    //blankパネルと隣接しているかチェック
    if (isAdjacentToblank(pos)) {
      //隣接していたら交換
      swap(pos);
      check();
    }
  };
  const check = () => {
    let okCount = 0;
    for (let panel of panels) {
      if (
        panel.posId !== blankIdx &&
        panel.posId === parseInt(panel.textContent) - 1
      ) {
        okCount++;
        panel.classList.add('ok');
      } else {
        panel.classList.remove('ok');
      }
    }
    if (okCount === size * size - 1) {
      msgBox.textContent = 'Complete!';
    }
  };
  init();
});
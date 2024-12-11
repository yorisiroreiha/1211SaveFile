import random
player_Money = random.randint(1000,2001)
menu = ["うどん","ペペロンチーノ","かつ丼","味噌ラーメン"]
buy = [200,280,320,300]

while True:
    print(f"所持金{player_Money}円")
    print("メニュー表")
    for i in range(len(menu)):
        print(f"{i} {menu[i]} {buy[i]}円")
    need = input("購入したいメニュー番号を入力してください(e:終了)>>")
    if need == "e" :
        break
    need = int(need)
    if player_Money < buy[need]:
        print("お金が足りません")
        continue
    print(f"{menu[need]}を購入しました")
    player_Money -= buy[need]
    menu.pop(need)
    buy.pop(need)
    if not menu:
        print("全部売り切れました")
        break


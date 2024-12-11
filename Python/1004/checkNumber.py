import random
num = random.randint(1,100)
timer = 5 
print("1-100の数字を選んだよ")
print("その数字を",timer,"回以内に当ててね")
for i in range(1,timer+1):
    print("現在",i,"回目")
    pans = int(input("君の予想は？>"))
    if pans == num:
        print("当たり")
        break
    elif i == timer:
        pass
    elif num < pans:
        print("大きすぎだよ")
    elif num > pans:
        print("小さすぎだよ")
else:
    print("残念正解は",num,"でした")


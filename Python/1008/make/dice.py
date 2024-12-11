import random
times = int(input("サイコロを何D振りますか"))
dice = [ random.randint(1,6) for i in range(times)]
print(dice)
print(f"合計は{sum(dice)}でした")
      
times = int(input("サイコロを何D振りますか>>"))
dice = [ random.randint(1,6) for i in range(times)]
print(dice)
print(f"合計は{set(dice)}の{len(set(dice))}種類でした")

times = int(input("100~1000の範囲の偶数をいくつ生成しますか>>"))
dice = [ random.randrange(100,1001,2) for i in range(times) ]
print(dice)
dice.sort(reverse=True)
print(f"{times}個生成しました!降順に表示します{dice}")

while True:
    user = int(input("手を入力[0:グー,1:チョキ,2:パー]>>"))
    pc = random.randint(0,2)
    hands=["グー","チョキ","パー"]
    print(f"{user}{pc}")
    results = ["","",""]
    print(results[(user+3-pc)%3])
    if user != pc:
        break

lists = [ i for i in range(1,100)]
random.shuffle(lists)
Awin = Bwin = 0 
for i in range(5):
    print(f"{i+1}回戦")
    a,b= lists.pop(),lists.pop()
    if a>b:
        Awin += 1
        winner = "A"
    else:
        Bwin += 1
        winner = "B"
    print(f"{a}{b}{winner}")
print(f"{max(Awin,Bwin)}{min(Awin,Bwin)}{"A" if Awin>BWin else "B"}")

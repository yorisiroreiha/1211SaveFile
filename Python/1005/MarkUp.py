first_Human = []
second_Human = []
Humans = [first_Human,second_Human]
for i in range(len(Humans)):
    print(f"{i+1}番目の方どうぞ")
    count = 0
    while True:
        count += 1
        temp = input(f"{count}つ目の趣味を入力してください＞")
        if temp=="e":
            break;
        else:
            Humans[i].append(temp)
input("心の準備ができたらEnterキーを押してください")
aishou = (len(set(first_Human) & set(second_Human))) * 100 / (len(set(first_Human) | set(second_Human )))
print(f"相性度:{round(aishou,1)}%")

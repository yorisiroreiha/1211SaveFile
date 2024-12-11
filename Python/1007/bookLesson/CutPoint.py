score = int(input("点数を入力してください＞"))
if score < 0 or score > 100 :
    print("不正な値")
elif 60 <= score <= 100 :
    print("合格")
else :
    print("不合格")



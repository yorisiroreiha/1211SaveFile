scores = {"network":60,"database":80,"security":50}
key = input("追加する科目を入力してください＞")
if key in scores:
    print("すでに追加済みです")
else:
    data = int(input("点数を入力してください＞"))
    scores[key] = data 
print(scores)


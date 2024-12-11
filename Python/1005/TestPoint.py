test = ["国語","数学","理科","社会","英語"]
user = []
for i in range(len(test)):
    user.append(int(input(f"{test[i]}の点数を入力してください>")))
print("合計点:",sum(user))
print("平均点:",sum(user)/len(user))
user_Test = dict(zip(test,user))
print("各教科の点数は以下です")
print(user_Test)

def welcome(u):
    print(f"ようこそ{u["name"]}さん")
    u["age"] += 1
    print(f"あなたは来年{u["age"]}歳だから大吉です")

user_Name = input("名前を入力してください＞＞")
user_Age = int(input("年齢を入力してください＞＞"))
user = {"name":user_Name,"age":user_Age}
copy = {"name":user["name"],"age":user["age"]}
welcome(copy)
copy = user.copy()
welcome(copy)
print(f"{user["age"]}歳の{user["name"]}さんまたプレイしてくださいね")

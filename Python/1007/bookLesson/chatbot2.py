print("すべての質問にｙあるいはｎで答えてください")
havamoney = input("お金に余裕はありますか？＞")
if havamoney == "y" :
    needsake = input("飲みたいですか？")
    needeat  = input("食べたいですか？")
    if needsake == "y" and needeat == "y":
        print("焼肉はいかがでしょうか")
    elif needsake == "n" and needeat == "y":
        print("カレーはいかがでしょうか")
    elif needsake == "y" and needeat == "n":
        print("焼き鳥はいかがでしょうか")
    else :
        print("パスタはいかがでしょうか")
    neednight = input("夜食は必要ですか")
    if neednight == "y":
        print("コンビニのチキンはいかがでしょうか")
else:
    print("家で食べましょう")


step = int(input("何段の階段を作りますか？＞"))
for i in range(step):
    for j in range(i+1):
        print("*",end=" ")
    print()
print("完成")


step = int(input("何段の階段を作りますか？＞"))
for i in range(1,step+1):
    print("*"*i,end=" ")
    print()

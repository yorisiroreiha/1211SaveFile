import random

lotts = [f"{i:04d}" for i in range(10000)]

user = int(input("宝くじを何枚買いますか？＞＞"))
my_Lotts = sorted(random.sample(lotts,user))
print(my_Lotts)

lucky="{:04d}".format(random.randrange(10000))
print("抽選開始Enterで進む")
for c in lucky:
    not_Use = input()
    print(c)

result=[[]for i in range(4)]
for lott in my_Lotts:
    if lucky == lott:
        result[0].append(lott) 
    elif lucky[-3:] == lott[-3:]:
        result[1].append(lott)
    elif lucky[-2:] == lott[-2:]:
        result[2].append(lott)
    elif lucky[-1:] == lott[-1:]:
        result[3].append(lott)

for i in range(len(result)):
    print("{}等賞({:*>4s})".format(i+1,lucky[i:]),result[i])

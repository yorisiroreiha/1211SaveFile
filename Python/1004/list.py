members = ["工藤","松田","浅木"]
print(members)
print(members[0])
#print(members[3])#error

score = [88,90,95]
print(sum(score))#88+90+95

print(len(score))#3

score.append(55)
print(score)
num = score.pop()
print(num)
num = score.pop(0)
print(num)

del score[0]
print(score)#95

NumList = [5,3,4,2,1]
NumList.sort()
print(NumList)
NumList.sort(reverse=True)
print(NumList)

NewList = NumList[1:3]
print(NewList)

New2List = NumList[-2:]
print(New2List)

New3List = NumList[2:100]
print(New3List)

New4List = [10,20,30,40,50,60,70,80,90,100]
New5List = New4List[1:7:2]
print(New5List)

New6List = New4List[::-1]
print(New6List)

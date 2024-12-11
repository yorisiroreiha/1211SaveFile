numbers = list()
for i in range(10):
    temp = list()
    for j in range(10):
        temp.append(0)
    numbers.append(temp)
import pprint
pprint.pprint(numbers)

data = [1,2,3]+[4,5]
print(data)
data2 = [1,2,3] * 3
print(data2)

#numbers2 = [None] * 10
#for i in range(9):
#    data[i] = [0] * 10
#pprint.pprint(numbers)

numbers3 = []
for i in range(10):
    numbers3.append([0]*10)
pprint.pprint(numbers)

numbers4 = [[0]*10]*10
pprint.pprint(numbers4)
numbers4[0][2] = 3
pprint.pprint(numbers4)

numbers5 = [[0]* i for i range(10)]
pprint.pprint(numbers5)

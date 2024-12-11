import random
times = int(input("何回振る？>"))
dices = []
for i in range(times):
    temp = random.randint(1,6)
    dices.append(temp)
print(dices)
print(sum(dices))

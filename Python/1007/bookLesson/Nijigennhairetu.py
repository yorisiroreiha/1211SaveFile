import pprint
print(1)
data = [[100-i-(10*j) for i in range(0,10)] for j in range(0,10)]
pprint.pprint(data)

print(2)
data = [[1 if (a - b) % 4 == 0 or (a+b) % 4 == 0 else 0 for a in range(0,5)] for b in range(0,5)]
pprint.pprint(data)

print(3)
data = [[i+(10*j) for i in range(0,-100,-10)] for j in range(0,10)]
pprint.pprint(data)

print(4)#escape
data = []
pprint.pprint(data)

print(5)
data = [[i if i==j else 0 for i in range(1,5)] for j in range(1,5)]
pprint.pprint(data)

print(6)
data = [[i+(10*j) for i in range(0,9)] for j in range(6,10)]
pprint.pprint(data)

print(7)
data = [[i*j for i in range(1,10)] for j in range(1,10)]
pprint.pprint(data)

print(8)
data = [[3 if i * j == 1 else 7 for i in range(0,3)] for j in range(0,3)]
pprint.pprint(data)

print(9)
data = [[i*j for i in range(1,10)] for j in range(3,11,2)]
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)

print()
data = []
pprint.pprint(data)


import pprint 
data = [i for i in range(0,10)]
print(1)
pprint.pprint(data)

data = [i for i in range(1,11) if i % 2 == 0 ]
print(2)
pprint.pprint(data)

data = [10-i for i in range(0,10)]
print(3)
pprint.pprint(data)

data = [s for s in 'abc']
print(4)
pprint.pprint(data)

data = [i for i in range(1,21) if i % 3 == 0]
print(5)
pprint.pprint(data)

data = [i*2 for i in range(1,6)]
print(6)
pprint.pprint(data)

data = [i*i for i in range(0,10) if i % 2 == 0]
print(7)
pprint.pprint(data)

data = [s.upper() for s in ["apple","banana","cherry"]]
print(8)
pprint.pprint(data)

data = [i*i for i in range(1,11) if i % 2 == 1 ]
print(9)
pprint.pprint(data)

data = ["even" if  i % 2 == 0 else "odd"  for i in range(1,6) ]
print(10)
pprint.pprint(data)


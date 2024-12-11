n=0
while n < 10:
    print(n)
    n=n+1
print("end")

for i in range(1,11):
    print(i,end=" ")
print();

msg="hello"
for c in msg:
    print(c)
print()

for i in [1,2,3]:
    print(i)
print()

for i in range(1,4):
    for j in range(1,11):
        print(i*j,end=" ")
print()

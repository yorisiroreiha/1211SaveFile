ages = [28,50,"秘密","26a","29",8,20,78,25,22,10,27,33]
num = 5
samples= list()
for data in ages:
    if not isinstance(data,int):
        continue
    if data < 20 or data > 30:
        continue
    samples.append(data)
    if len(samples)==num:
        break
print(samples)

n = 1
minute = 0
days = input("何日分処理しますか？＞");
days = int(days)
day_minute = days * 24 * 60
while minute < day_minute:
    n*=2
    minute += 5
    
print(n)

for i in range(5):
    print(i)

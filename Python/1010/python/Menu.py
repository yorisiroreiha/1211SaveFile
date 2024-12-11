menu = {"a":300,"b":400,"c":500,"d":600}
money = 2000

while True:
    keys = list(menu.keys())
    for i in range(len(menu)):
        temp = keys[i]
        print(f"{i}:{temp}>>{menu.get(temp)}円")
    need = input("what need you ?(if you input e is end)>>")
    if need == "e" :
        print("System is close")
        break;
    need = int(need)
    temp = keys[need]
    print(f"you need {temp}?({menu.get(temp)})")
    input()
    menu.pop(temp)



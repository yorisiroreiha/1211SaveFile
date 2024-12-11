

# import
import random
# global
## monster data
slime = {
    "name":"スライム",
    "hp":100,
    "max_Hp":100,
    "element":"水",
    "at":10,
    "df":1
        }
goblin = {
    "name":"ゴブリン",
    "hp":200,
    "max_Hp":200,
    "element":"土",
    "at":20,
    "df":5
        }
bigbat = {
    "name":"オオコウモリ",
    "hp":300,
    "max_Hp":300,
    "element":"風",
    "at":30,
    "df":10
        }
wearwolf = {
    "name":"ウェアウルフ",
    "hp":400,
    "max_Hp":400,
    "element":"風",
    "at":40,
    "df":15
        }
dragon = {
    "name":"ドラゴン",
    "hp":600,
    "max_Hp":600,
    "element":"火",
    "at":50,
    "df":20
        }
enemys = [slime,goblin,bigbat,wearwolf,dragon]
seiryu = {
    "name":"青龍",
    "hp":150,
    "max_Hp":150,
    "element":"風",
    "at":15,
    "df":10
    }
suzaku = {
    "name":"朱雀",
    "hp":150,
    "max_Hp":150,
    "element":"火",
    "at":25,
    "df":10
    }
byakko = {
    "name":"白虎",
    "hp":150,
    "max_Hp":150,
    "element":"土",
    "at":20,
    "df":5
    }
genbu = {
    "name":"玄武",
    "hp":150,
    "max_Hp":150,
    "element":"水",
    "at":20,
    "df":15
    }
partys = [seiryu,suzaku,byakko,genbu] 
element_Symbols = {
    "火":"$",
    "水":"~",
    "風":"@",
    "土":"#",
    "命":"&",
    "無":" "
        }
element_Colors = {
    "火":1,
    "水":6,
    "風":2,
    "土":3,
    "命":5,
    "無":7
        }
elements = ["火","水","風","土","命","無"]
## /monster data
## hp
player_Hp = 0
## /hp
## grafic 
keyArea = "ABCDEFGHIJKLMN"
grafic = []
## /grafic
# def area

def main():
    global player_Hp
    print("***Puzzle & Monsters***")
    while True:
        playerName = input("what your name ? >>")
        if playerName == None or playerName == "":
            print("plz input your name")
            continue
        else:
            break
    for i in range(len(partys)):
        player_Hp += partys[i].get("hp") 
    clearStep = go_Dungeon(playerName)
    if clearStep == 5:
        print("***Game cleared***")
        print(f"倒したモンスター数{clearStep}")
    else:
        print("***Game feiled***")
    
def go_Dungeon(playerName):
    global player_Hp
    print(f"{playerName}({player_Hp}) in dungeon")
    show_Party(partys)
    count = 0 ;
    while True:
        count += 1
        print(f"{count}階層目")
        winLose = do_battle(enemys[count-1])
        if winLose == 1:
            print_monster_name(enemys[count-1])
            print("を倒した!")
        else:
            print_monster_name(enemys[count-1])
            print("を倒せなかった!")
            count -= 1
            break
        if count == 5:
            break
    print(f"{playerName} out dungeon")
    return count

def do_battle(enemys):
    global player_Hp
    print_monster_name(enemys)
    print("が現れた!")
    count = 0
    enemy_Hp = enemys.get("hp")
    player_Df = 0
    for i in range(len(partys)):
        player_Df += partys[i].get("df")
    player_Df = float(player_Df/len(partys))
    print_setcomand()
    while True:
        count += 1
        print(f"{count}R目")
        print_comand()
        changeword = input("plz press two words and enter")
        ###ここから###
        damage = player_attack(partys)
        enemy_Hp -= damage_Check(damage,enemys.get("df"),1,1)
        ###ここまで###
        damage = enemy_attack(enemys)
        player_Hp -= damage_Check(damage,player_Df,1,1)
        if enemy_Hp <= 0:
            return 1
        elif player_Hp <= 0:
            return 0

def print_monster_name(enemys):
    temp = element_Symbols.get(enemys.get("element"))
    printName = enemys.get("name")
    color = element_Colors.get(enemys.get("element"))
    print(f"\033[3{color}m{temp}{printName}{temp}\033[0m",end="")

def show_Party(partys):
    print("<パーティー編成>-----------")
    for i in range(len(partys)):
        print_monster_name(partys[i])
        print(f"HP={partys[i].get("hp")}攻撃={partys[i].get("atk")}防御={partys[i].get("df")}")
    print("---------------------------")

def player_attack(partys):
    damage = 0
    for i in range(len(partys)):
        damage += partys[i].get("at")
    return damage

def enemy_attack(enemys):
    damage = enemys.get("at")
    return damage

def damage_Check(damage,df,weekpoint,combotimes):
    result = ((damage-df)*random.randint(-10,11))/100+(damage-df)
    result = result * weekpoint * combotimes
    print(f"{int(result)}のダメージ")
    return int(result)

def combo_Check(deleteblock,combo):
    combotimes = 1.5 ^ (deleteblock - 3 + combo)
    return combotimes

def heal(combotimes):
    global player_Hp
    healpoint = ((combotimes*20)*random.randint(-10,11))/100+(combotimes*20)
    player_Hp += int(healPoint)


def print_setcomand():
    global elements
    global keyArea
    global grafic
    grafic = [elements[random.randint(0,len(elements)-2)] for i in range(14)]

def print_comand():
    global elements
    global keyArea
    global grafic
    for i in range(len(grafic)):
        print(f"{element_Symbols.get(grafic[i])} ",end="")
    print()
    for i in range(len(keyArea)):
        print(f"{keyArea[i]} ",end="")
    print()

def action_Check(front,back):
    global grafic
    temp = grafic[front]
    grafic[front] = "無"
    if front < back:
        for i in range(front,back,1):
            grafic[i] = grafic[i+1]
    elif back < front:
        for i in range(front,back,-1):
            grafic[i] = grafic[i-1]
    else:
        print("Error:front と back が同じです。何もしません。")
    grafic[back] = temp



    
# main

main()


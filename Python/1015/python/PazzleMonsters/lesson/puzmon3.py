

# import

# global
## monster data
slime = {
    "name":"スライム",
    "hp":100,
    "max_Hp":100,
    "element":"水",
    "atk":10,
    "def":1
        }
goblin = {
    "name":"ゴブリン",
    "hp":200,
    "max_Hp":200,
    "element":"土",
    "atk":20,
    "def":5
        }
bigbat = {
    "name":"オオコウモリ",
    "hp":300,
    "max_Hp":300,
    "element":"風",
    "atk":30,
    "def":10
        }
wearwolf = {
    "name":"ウェアウルフ",
    "hp":400,
    "max_Hp":400,
    "element":"風",
    "atk":40,
    "def":15
        }
dragon = {
    "name":"ドラゴン",
    "hp":600,
    "max_Hp":600,
    "element":"火",
    "atk":50,
    "def":20
        }
enemys = [slime,goblin,bigbat,wearwolf,dragon]
## /monster data
# def area

def main():
    print("***Puzzle & Monsters***")
    while True:
        playerName = input("what your name ? >>")
        if playerName == None or playerName == "":
            print("plz input your name")
            continue
        else:
            break
    clearStep = go_Dungeon(playerName)
    if clearStep == 5:
        print("***Game cleared***")
        print(f"倒したモンスター数{clearStep}")
    else:
        print("***Game feiled***")
    
def go_Dungeon(playerName):
    print(f"{playerName} in dungeon")
    count = 0 ;
    while True:
        count += 1
        print(f"{count}階層目")
        winLose = do_battle(enemys[count-1])
        if winLose == 1:
            print(f"{enemys[count-1].get("name")}を倒した")
        if count == 5:
            break
    print(f"{playerName} out dungeon")
    return count

def do_battle(enemys):
    print(f"{enemys.get("name")}が現れた!")
    return 1

# main

main()


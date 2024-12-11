

# import

# global

# def area

def main():
    print("***Puzzle & Monsters***")
    try:
        playerName = input("what your name ? >>")
        clearStep = go_Dungeon(playerName)
    except:
        print("must input your name")    
    if clearStep == 5:
        print("***Game cleared***")
        print(f"倒したモンスター数{clearStep}")
    else:
        print("Game feiled***")
    
def go_Dungeon(playerName):
    print(f"{playerName} in dungeon")
    count = 0 ;
    enemyName = ["スライム","ゴブリン","オオコウモリ","ウェアウルフ","ドラゴン"]
    while True:
        count += 1
        print(f"{count}階層目")
        winLose = do_battle(enemyName[count-1])
        if winLose == 1:
            print(f"{enemyName[count-1]}を倒した")
        if count == 5:
            break
    print(f"{playerName} out dungeon")
    return count

def do_battle(enemyName):
    print(f"{enemyName}が現れた!")
    return 1

# main

main()


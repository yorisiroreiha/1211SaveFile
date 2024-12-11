

# import

# global

# def area

def main():
    print("***Puzzle & Monsters***")
    playerName = input("what your name ? >>")
    clearStep = go_Dungeon(playerName)
    if clearStep == 5:
        print("***Game cleared***")
        print(f"倒したモンスター数{clearStep}")
    else:
        print("Game feiled***")
    
def go_Dungeon(playerName):
    print(f"{playerName} in dungeon")
    count = 0 ;
    while True:
        count += 1
        print(f"{count}階層目")
        if count == 5:
            break
    print(f"{playerName} out dungeon")
    return count
# main

main()


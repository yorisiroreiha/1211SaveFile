try:
    price = int(input("料金を入力＞＞"))
    number = int(input("人数を入力＞＞"))
    print(f"1人あたり{price/number}円です")
except ValueError:
    print("料金と人数は整数を入力してください")
except ZeroDivisionError:
    print("0は入力できません")
finally:
    print("プログラムを終了します")

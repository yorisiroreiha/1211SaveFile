count = 0 
student_Num = int(input("生徒の数を入力してください＞"))
score_List = list()
while count < student_Num:
    count += 1
    score = int(input(f"{count}人目の点数を入力してください＞"))
    score_List.append(score)
print(score_List)
total = sum(score_List)
print(f"平均点は{total/student_Num}点です")

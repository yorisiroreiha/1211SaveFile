text = input("何を記録しますか")
file = open("diary.text","a")
file.write(text+"\n")
file.close()

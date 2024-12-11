x = 10 
y = 20

def changeNum():
    global x
    global y
    x = 30 ;
    y = 10 ;

taples = (x,y)
changeNum()
taple2 = (x,y)
print(taples)
print(taple2)

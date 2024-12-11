import turtle
t=turtle.Turtle()
t.shape('turtle')
for i in range(4):
    t.forward(100) # 向いている方向に100移動
    t.right(90) # 90度右回転
#t.forward(100)
#t.home() # 原点に移動し、デフォルトの方向を向く（右)
turtle.mainloop()

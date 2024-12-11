import turtle
t=turtle.Turtle()
t.shape('turtle')
t.color('blue') # 線色を青に
t.forward(100)
t.left(90)
t.forward(100)
t.right(90)
t.forward(100)
t.penup() # ペンを持ち上げる（線が描画されない)
t.home()

turtle.mainloop()

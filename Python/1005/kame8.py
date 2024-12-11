import turtle
t1=turtle.Turtle()
t1.shape('turtle')
t1.color('blue')
t1.speed(8)
t2=turtle.Turtle()
t2.shape('turtle')
t2.color('red')
t2.speed(8)
t3=turtle.Turtle()
t3.shape('turtle')
t3.color('green')
t3.speed(8)

def make_square(t):
	for i in range(4):
		t.forward(100)
		t.right(90)

def make_spiral(t):
	for i in range(1):
		make_square(t)
		t.right(10)

t1.right(3)
t2.right(6)
t3.right(9)
for i in range(36):
    make_spiral(t1)
    make_spiral(t2)
    make_spiral(t3)
turtle.mainloop()

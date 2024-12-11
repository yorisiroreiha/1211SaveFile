import turtle
t1=turtle.Turtle()
t1.shape('turtle')
t1.color('blue')
t2=turtle.Turtle()
t2.shape('turtle')
t2.color('red')
t3=turtle.Turtle()
t3.shape('turtle')
t3.color('green')

def make_square(t):
	for i in range(4):
		t.forward(100)
		t.right(90)

def make_spiral(t):
	for i in range(36):
		make_square(t)
		t.right(10)

make_spiral(t1)
t2.right(5)
make_spiral(t2)
t3.right(15)
make_spiral(t3)
turtle.mainloop()

import random 
import turtle

kames=["blue","red","yellow","brown","green"]

def setup():
    global kames
    screen=turtle.Screen()
    screen.setup(1290,720)
    screen.bgpic("pavement.gif")
    startline=-620

    for i in range(len(kames)):
        kame = turtle.Turtle()
        kame.shape("turtle")
        kame.color(kames[i]);
        kame.penup()
        kame.setpos(startline,(len(kames)//2)*-40+40*i)
        kame.pendown()
        kames[i]= kame

def race():
    global kames
    finishline=540

    while True:
        for current_t in kames:
            move=random.randint(0,20)
            current_t.forward(move)

            x= current_t.xcor()
            if x >=finishline:
                winner_color=current_t.color()
                current_t.write("win"+winner_color[0],font=("arial",16,"bold"))

                return

setup()
race()
turtle.mainloop()

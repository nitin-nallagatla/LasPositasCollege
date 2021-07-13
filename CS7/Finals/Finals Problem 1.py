# Finals Problem 1
# Nitin Nallagatla | CS7 | Summer 2019

# Sets up drawing.
import turtle
import random
turtle.speed(0)
turtle.penup()
turtle.goto(0, 250)
turtle.pendown()

# Sets colors.
color1 = 'red'
color2 = 'green'
color3 = 'blue'
color4 = 'orange'

# Draws pentagons.
for i in range(8):
    for n in range(5):
        randomNo = random.randint(1, 4)
        if randomNo == 1:
            turtle.fillcolor(color1)
        elif randomNo == 2:
            turtle.fillcolor(color2)
        elif randomNo == 3:
            turtle.fillcolor(color3)
        else:
            turtle.fillcolor(color4)
        turtle.begin_fill()
        for z in range(6):
            turtle.pendown()
            turtle.forward(60)
            turtle.left(72)
            turtle.penup()
        turtle.end_fill()
        turtle.right(72)
        turtle.backward(50)
    turtle.right(10)

# Moves turtle.
turtle.left(10)
turtle.forward(30)

# Draws circles.
for i in range(12):
    for n in range(5):
        randomNo = random.randint(1, 4)
        if randomNo == 1:
            turtle.fillcolor(color1)
        elif randomNo == 2:
            turtle.fillcolor(color2)
        elif randomNo == 3:
            turtle.fillcolor(color3)
        else:
            turtle.fillcolor(color4)
        turtle.begin_fill()
        turtle.pendown()
        turtle.circle(50)
        turtle.penup()
        turtle.end_fill()
        turtle.forward(3)
    turtle.right(10)
    turtle.forward(5)

# Moves turtle.
turtle.left(10)
turtle.pendown()

# Draws bottom circles.
for i in range(35):
    randomNo = random.randint(1, 4)
    if randomNo == 1:
        turtle.fillcolor(color1)
    elif randomNo == 2:
        turtle.fillcolor(color2)
    elif randomNo == 3:
        turtle.fillcolor(color3)
    else:
        turtle.fillcolor(color4)
    turtle.begin_fill()
    turtle.forward(4)
    turtle.circle(50)
    turtle.end_fill()

for i in range(8):
    for n in range(5):
        randomNo = random.randint(1, 4)
        if randomNo == 1:
            turtle.fillcolor(color1)
        elif randomNo == 2:
            turtle.fillcolor(color2)
        elif randomNo == 3:
            turtle.fillcolor(color3)
        else:
            turtle.fillcolor(color4)
        turtle.begin_fill()
        for z in range(4):
            turtle.pendown()
            turtle.forward(100)
            turtle.left(90)
            turtle.penup()
        turtle.end_fill()
        turtle.forward(5)
    turtle.right(7)
    turtle.forward(10)

# Moves turtle.
turtle.forward(70)
turtle.left(90)
turtle.forward(110)
turtle.right(90)

# Draws triangles.
for n in range(4):
    randomNo = random.randint(1, 4)
    if randomNo == 1:
        turtle.fillcolor(color1)
    elif randomNo == 2:
        turtle.fillcolor(color2)
    elif randomNo == 3:
        turtle.fillcolor(color3)
    else:
        turtle.fillcolor(color4)
    turtle.begin_fill()
    for z in range(4):
        turtle.pendown()
        turtle.forward(100)
        turtle.right(120)
        turtle.penup()
    turtle.end_fill()
    turtle.left(90)

turtle.fillcolor(1)
turtle.begin_fill()
for i in range(2):
    turtle.pendown()
    for z in range(4):
        turtle.forward(100)
        turtle.right(120)
turtle.end_fill()

turtle.done()

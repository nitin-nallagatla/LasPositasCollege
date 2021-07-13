# Midterms Problem 2
# Nitin Nallagatla | CS7 |  Summer 2019
import turtle

# Sets up turtle functions.
turtle.speed(0)
color1 = 'yellow'
color2 = 'black'

# Creates for loop to make all the pentagons.
for i in range(10):
    # Uses for loop to move pentagons.
    for x in range(1):
        if i % 2 == 0:
            turtle.fillcolor(color1)
        else:
            turtle.fillcolor(color2)
        turtle.begin_fill()
        # Uses for loop to draw pentagons.
        for z in range(6):
            turtle.pendown()
            turtle.forward(60)
            turtle.left(72)
            turtle.penup()
        turtle.end_fill()
    # Moves pentagon.
    turtle.right(72)
    turtle.backward(50)


turtle.done()

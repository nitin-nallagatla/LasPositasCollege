# Lab 4 - 3 - 6
# Nitin Nallagatla | CS7 | Summer 2019

import random

# Outer for loop prints lines
for n in range(10):

    # Inner for loop prints numbers in lines.
    for i in range(10):
        # Sets up randomNo as random number.
        randomNo = random.randint(1, 100)
        # if structure sets up formatting.
        if randomNo != 100:
            print(randomNo, '\t', end='')
        else:
            print(randomNo, "", end='')
    print()
























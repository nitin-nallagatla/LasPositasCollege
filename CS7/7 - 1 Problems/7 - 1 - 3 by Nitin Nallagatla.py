# Lab 7 -1 - 3
# Nitin Nallagatla | CS7 | Summer 2019
import random

# Sets up variables
list1 = []
list2 = []
LISTLENGTH = 5

# Fills lists.
for i in range(LISTLENGTH):
    randomNumber = random.randint(1, 100)
    list1.append(randomNumber)

    randomNumber2 = random.randint(1, 100)
    list2.append(randomNumber2)

# Concatenates lists
totalList = list1 + list2
subtotal = 0
counter = 0

# Returns setup, list values, and average.
print("The list is: ", end='')
for value in totalList:
    print(value, ", ", sep='', end='')
    subtotal = value + subtotal
    counter += 1

print("\nThe average is", subtotal/counter)
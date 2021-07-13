# Lab 7 - 1 - 1
# Nitin Nallagatla | CS7 | Summer 2019
import random

# Sets up list and constants
randomNumbers = []
listLength = 11

# Creates list out of random nummbers.
for i in range(listLength):
    randomNo = random.randint(1, 100)
    randomNumbers.append(randomNo)
print(randomNumbers)

# Prints and formats header.
print("Number\tTimes Ten\tTimes 100")
print("------\t---------\t---------")

# Prints and formats list.
for i in range(listLength):
    y = randomNumbers[i]
    print(y, "\t\t\t", (y * 10), "\t\t", (y * 100))


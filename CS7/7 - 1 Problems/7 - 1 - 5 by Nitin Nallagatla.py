# Lab 7 -1 - 5
# Nitin Nallagatla | CS7 | Summer 2019
import random

# Sets up list and constant.
listOf1000 = []
LENGTH = 1001

# Fills list.
for i in range(LENGTH):
    randomNumber = random.randint(1, 1000)
    listOf1000.append(randomNumber)

# Sorts list.
listOf1000.sort()

# Sets up accumulators.
evens = 0
odds = 0
total = 0
counter = 0

# For loop identifies odds, evens, and keeps count and sum of all numbers.
for n in listOf1000:
    if n % 2 == 0:
        evens += 1
    elif n % 2 == 1:
        odds += 1
    total = n + total
    counter += 1

# Returns results.
print("There are", evens, "even and", odds, "odd numbers.")
print("The sum of all the numbers is", total, "and their average is", total/counter)
print("The smallest number is ", listOf1000[0], ", and the largest number is ", listOf1000[1000], sep='')

# Lab 5 - 1 - 1
# Nitin Nallagatla | CS7 | Summer 2019

import random

print("500 NUMBER STATISTICS")

# Initializes constants.
MAX = 50000
MIN = 0

# Sets up the variables to keep track of statistics.
numberCount = 0
even = 0
odd = 0
total = 0
lowest = MAX + 1
highest = MIN - 1


for i in range(1, 501):

    # Generates random numbers.
    randomNo = random.randint(MIN, MAX)

    # Accumulates and keeps count of the numbers.
    total = randomNo + total
    numberCount += 1

    # Identifies odd and even and keeps count.
    if randomNo % 2 == 0:
        even += 1
    else:
        odd += 1

    # Identifies lowest and highest numbers.
    if randomNo < lowest:
        lowest = randomNo
    if randomNo > highest:
        highest = randomNo


# Returns results.
print("The total number of even numbers is", even)
print("The total number of odd numbers is", odd)
print("The highest number was", highest)
print("The lowest number was", lowest)
print("The total sum was", total)
print("The average was", format((total/numberCount), '.2f'))

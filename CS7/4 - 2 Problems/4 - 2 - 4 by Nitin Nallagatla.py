# Lab 4 - 2 Problem 4
# Nitin Nallagatla | CS7 | Summer 2019

print("SUM CALCULATOR")

# Takes input.
userNumber = int(input("Give me an integer that is greater than or equal to one. \n"
                       "I will give you the sum of all numbers going up to it. "))

# Checks whether number is valid.
if userNumber > 0:

    # Calculates the sum of all the numbers.
    subtotal = 0
    for i in range(userNumber):
        subtotal = subtotal + .5 * (userNumber + 1)
    print("The sum of every number from 1 up to %s is" % userNumber, int(subtotal))

# Returns error message if number is not valid.
else:
    print("Sorry, that isn't valid.")












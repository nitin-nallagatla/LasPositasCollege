# Lab 4 - 2 Problem 3
# Nitin Nallagatla | CS7 | Summer 2019

print("FACTORIAL CALCULATOR")

# Takes input.
userInput = int(input("Please enter an integer between 1 and 15.\n"
                      "I will give you its factorial. "))

# Checks whether it is in the range.
if 15 >= userInput >= 1:

    # Sets up for loop to calculate the factorial.
    product = 1
    for i in range(1, userInput):
        product = product * (i + 1)
    print("%s factorial is " % userInput, product, ".", sep='')

# If the inputted number is not in range, returns an error message.
else:
    print("That's not in the range of numbers we asked for.")


































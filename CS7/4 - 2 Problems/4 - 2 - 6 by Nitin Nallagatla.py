# Lab 4 - 2 Problem 6
# Nitin Nallagatla | CS7 | Summer 2019

print("ODD/EVEN IDENTIFIER")

# Takes input.
numberOfRounds = int(input("How many numbers do you want to test? "))

# Sets up for loop for number of repetitions.
for i in range(1, (numberOfRounds + 1)):
    test = int(input("\t> Enter number %s: " % i))

    # Calculates whether the number is odd or even.
    if test % 2 == 0:
        print("\t> It's even.")
    elif test % 2 == 1:
        print("\t> It's odd.")

























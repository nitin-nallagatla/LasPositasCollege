# Lab 4 - 3 - 2
# Nitin Nallagatla | CS7 | Summer 2019

print("2 NUMBER GUESSING GAME")

# Imports random, then takes input number and takes random CPU number.
import random

randomNumber = random.randint(1, 2)

userNumber = int(input("Please enter either one or two. \n"
                       "We'll tell you whether you guessed our number. "))

# Used to start while loop.
userReplay = 'y'

while userReplay == 'y' or 'Y' or 'yes' or 'Yes':

    # Outer if/else structures test  the number. If yes, goes here:
    if userNumber == randomNumber:

        # Prints result
        print("CORRECT!")

        # Asks user if they want to retry.
        userReplay = input("Do you want to play again? Y/N:")

        # Inner if/else structures test whether player wants to retry.
        if userReplay == 'Y':
            userNumber = int(input("Please enter one or two. "))

        # If they don't want to retry, ends function.
        else:
            print("Goodbye!")
            break

    # Outer if/else structures test  the number. If no, goes here:
    else:

        # Prints Result
        print("INCORRECT")

        # Asks user if they want to retry.
        userReplay = str(input("Do you want to play again? Y/N:"))

        # Inner if/else structures test whether player wants to retry.
        if userReplay == 'Y':
            userNumber = int(input("Please enter one or two. "))

        # If they don't want to retry, ends function.
        else:
            print("Goodbye!")
            break

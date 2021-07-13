# Lab 4 - 3 - 7
# Nitin Nallagatla | CS7 | Summer 2019

print("2 NUMBER GUESSING GAME")

# Imports random, then takes input number and takes random CPU number.
import random

randomNumber = random.randint(1, 2)

userNumber = int(input("Please enter either one or two. \n"
                       "We'll tell you whether you guessed our number. "))

# Used to start while loop.
userReplay = 'y'

# Defines incorrect and correct accumulators
numberCorrect = 0
numberWrong = 0

# While loop keeps game going.
while userReplay == 'y' or 'Y' or 'yes' or 'Yes':

    # Outer if/else structures test  the number. If yes, goes here:
    if userNumber == randomNumber:

        # Prints result
        print("CORRECT!")

        # Accumulates number correct
        numberCorrect += 1

        # Asks user if they want to retry.
        userReplay = str(input("Do you want to play again? Y/N: "))

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

        # Accumulates number incorrect
        numberWrong += 1

        # Asks user if they want to retry.
        userReplay = str(input("Do you want to play again? Y/N: "))

        # Inner if/else structures test whether player wants to retry.
        if userReplay == 'Y':
            userNumber = int(input("Please enter one or two. "))

        # If they don't want to retry, ends function.
        else:
            print("Goodbye!")
            break


# Returns Results
print("You got", numberCorrect, "right and", numberWrong, "wrong!")
print("That's ", format(numberCorrect/(numberCorrect + numberWrong), '.1%'), "right, and",
      format(numberWrong/(numberCorrect + numberWrong), '.1%'), "wrong!")

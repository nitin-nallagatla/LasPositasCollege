# Finals Problem 3
# Nitin Nallagatla | CS7 | Summer 2019

# Prints starter and sets lists and initial variables.
import random
print("I've hidden a quarter under one of these cups labeled 1-10, Guess which!")
quarter = random.randint(1, 11)
cupList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
userPlay = 'Y'
userInput = int(input("Select a cup: %s: " % cupList))
numberOfTries = 1


# Defines incorrect message randomizer as a function.
def incorrectMessage():
    wrongMessage = random.randint(1, 4)
    if wrongMessage == 1:
        print("Nope. Tries: ", numberOfTries)
    elif wrongMessage == 2:
        print("No dice. Tries: ", numberOfTries)
    elif wrongMessage == 3:
        print("You seem to be bad at this. Tries: ", numberOfTries)
    elif wrongMessage == 4:
        print("You could use some work. Tries: ", numberOfTries)


# Sets up correct message as function.
def correctMessage():
    if numberOfTries >= 5:
        print("You found the quarter in", numberOfTries, "tries. That took quite some time.")
    elif numberOfTries <= 1:
        print("That's some luck. Nice! You found the quarter in", numberOfTries, "try.")
    elif numberOfTries < 5:
        print("You found the quarter in", numberOfTries, "tries. That was quite fast!")


if 1 <= userInput <= 10:
    if userInput == quarter:
        correctMessage()
    elif userInput != quarter:
        cupList.remove(userInput)
        incorrectMessage()
        userInput = int(input("Select another cup: %s: " % cupList))
        numberOfTries += 1
else:
    userInput = int(input("ERROR: Select a valid cup from the list: %s: " % cupList))
    wrongMessage = random.randint(1, 4)
    numberOfTries += 1


while userPlay == 'Y':

    if 1 <= userInput <= 10:
        if userInput == quarter:
            correctMessage()
            userPlay = input("Again? Y/N: ")
        elif userInput != quarter:
            cupList.remove(userInput)
            incorrectMessage()
            userInput = int(input("Select another cup: %s: " % cupList))
            numberOfTries += 1
            if userInput not in cupList:
                print("That's not an option anymore, so don't pick it.")
                userInput = int(input("Select another cup: %s: " % cupList))
            else:
                correctMessage()
    else:
        userInput = int(input("ERROR: Select a valid cup from the list: %s: " % cupList))
        wrongMessage = random.randint(1, 4)
        numberOfTries += 1


print("So soon? Thanks for playing!")








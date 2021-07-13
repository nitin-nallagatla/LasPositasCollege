# Lab 7 - 1 - 4
# Nitin Nallagatla | CS7 | Summer 2019

# Makes a list and takes input.
numberList = [32, 14, 9, 28, 25, 4, 39, 29, 21, 1, 7, 33, 36, 3, 11, 22, 26]
userGuess = int(input("Please enter a number from 0 - 40: "))

# outer for loop validates input.
if not 0 <= userGuess <= 40:
    print("That's not valid.")
else:
    # Nested for loop checks whether guess is in list.
    if userGuess in numberList:
        print("Congratulations, that's in the list!")
    else:
        print("Ooh, sorry. That's not right.")

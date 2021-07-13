# Lab 4 - 3 - 1
# Nitin Nallagatla | CS7 | Summer 2019

print("INPUT TESTER")

# Takes input
userInput = int(input("Please enter an integer between 10 and 100. "))

# Validates input.
if 100 >= userInput >= 10:
    print("Good Job!")

# If input is not in range, has user redo input until it is in range.
else:
        print("Try that again.")
        userInput = int(input("Please enter an integer between 10 and 100. "))

        # Once valid input is entered, returns a success message.
        if 100 >= userInput >= 10:
            print("You fixed it! Nice!")
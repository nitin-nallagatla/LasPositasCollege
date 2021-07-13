# Lab 4 - 3 - 4
# Nitin Nallagatla | CS7 | Summer 2019

print("NUMBER VAlUE IDENTIFIER")

# Takes input and sets accumulators.
userInput = int(input("Please enter any number. If it's smaller or equal to 20,\n"
                      "I'll tell you how many numbers you entered and give you their average. "))
numberCount = 1
numberSum = userInput

# Sets up while loop to keep repeating queries.
while userInput > 20:
    userInput = int(input("Please enter the next number: "))
    numberSum += userInput
    numberCount += 1

# Returns results.
print("The amount of numbers you gave me is", numberCount, "and the average is", (numberSum/numberCount))
























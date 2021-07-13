# Lab 4 - 1 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

print("Average Score Calculator")

# Defines variable oldScore and sets it to 0.
oldScore = 0.0

# Starts for loop with 4 repetitions
for i in range(1, 5):

    # Prompts input, while using the %s function to change the number of the student being asked for.
    score = float(input("Enter score for student #%s: " % i))

    # Adds oldScore to score to get newScore, and then sets that value to oldScore to calculate the sum.
    newScore = score + oldScore
    oldScore = newScore

# Calculates the average.
aveScore = newScore / i

# Prints average.
print("The average is:", aveScore)

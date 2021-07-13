# Lab 4 - 2 Problem 1
# Nitin Nallagatla | CS7 | Summer 2019

print("AVERAGE SCORE CALCULATOR")

# Defines variable oldScore and sets it to 0.
Accscore = 0.0

# Starts for loop with 10 repetitions
for i in range(1, 11):

    # Prompts input, while using the %s function to change the number of the student being asked for.
    score = float(input("Enter score for student #%s: " % i))

    # Adds oldScore to score to get newScore, and then sets that value to oldScore to calculate the sum.
    Accscore += score

# Calculates the average.
aveScore = Accscore / i

# Prints average.
print("The average is:", aveScore)

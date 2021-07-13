# Lab 4 - 3 - 3
# Nitin Nallagatla | CS7 | Summer 2019

print("AVERAGE SCORE CALCULATOR")

# States purpose, prompts input, sets accumulators.
print("Please give me your scores. I will give you their average. Enter -999 when you want to finish.")
score = float(input("Please give me the score: "))
scoreSubtotal = score
scoresCounter = 1

# Sets up while loop to keep asking for score until told not to.
while score != -999:
    score = float(input("Please give me the next score: "))
    if score != -999:
        scoreSubtotal = score + scoreSubtotal
        scoresCounter += 1

# Calculates and returns average.
average = scoreSubtotal / scoresCounter
print("The average score is:", format(average, '.1f'))





















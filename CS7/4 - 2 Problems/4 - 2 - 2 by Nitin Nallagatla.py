# Lab 4 - 2 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

print("WEIGHT LOSS CALCULATOR")

# Asks for current weight.
weightCurrent = int(input("How much do you weigh now? "))

# Sets up table and explains calculation basis.
print("You can expect the following weight loss at 500 calories per day deficit:")
print("Months\tWeight(lbs)")
print("------\t-----------")

# Prints our results of weight loss.
for i in range(1, 7):
    weightCurrent -= 4
    print(format(i, '6d'), format(weightCurrent, '11d'))













# Lab 4 - 1 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

# Sets up header.
print("Minutes\tCalories")
print("-------\t--------")

# Uses for loop to determine number of times to run.
for i in range(5, 31, 5):
    # Calculates calories burned.
    formula = i * 4.2
    # Prints calories formatted.
    print(format(i, '6d'), format(formula, '11.1f'))

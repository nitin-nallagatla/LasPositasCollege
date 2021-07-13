# Lab 7 - 1 - 2
# Nitin Nallagatla | CS7 | Summer 2019

# Creates list and accumulator
evenList = list(range(0, 101, 2))
subtotal = 0

# Prints out every number and calculates total.
for i in range(0, len(evenList)):
    print(evenList[i], "\t|\t", sep='', end='')
    subtotal = i + subtotal

# Prints total.
print("\nThe sum of all these even numbers is: ", subtotal, ".", sep='')
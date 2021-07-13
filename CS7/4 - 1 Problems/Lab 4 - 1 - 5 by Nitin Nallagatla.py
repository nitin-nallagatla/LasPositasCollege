# Lab 4 - 1 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

# Prints the title of the chart.
print("Numbers\tSquares\tCubes\tQuads\tPower of 5")
print("-------\t-------\t-----\t-----\t----------")

# Uses for loop to determine number of times to run.
for i in range(0, 10):
    # Calculates squares.
    sqFormula = int(i ** 2)

    # Calculates cubes.
    cbFormula = int(i ** 3)

    # Calculates quads.
    qdFormula = int(i ** 4)

    # Calculates powers of 5.
    power_of_5_Formula = int(i ** 5)
    # Prints values formatted into rows..
    print(format(i, '6d'), format(sqFormula, '6d'), format(cbFormula, '6d'),
          format(qdFormula, '7d'),  format(power_of_5_Formula, '12d'))














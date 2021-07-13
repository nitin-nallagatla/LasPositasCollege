# Midterms Problem 1
# Nitin Nallagatla | CS7 | Summer 2019

numberOfRounds = int(input("How many integers do you want to analyze? "))

even = 0
odd = 0
numberDivisible3 = 0
numberDivisible5 = 0
total = 0
# Checks number of rounds.
if numberOfRounds > 0:
    # Sets up repetitions.
    for i in range(1, (numberOfRounds + 1)):
        inputNumber = int(input("Please enter integer #%s: " % i))

# If number fits every circumstance.
        if inputNumber % 2 == 0 and inputNumber % 3 == 0 and inputNumber % 5 == 0:
            print(inputNumber, "is:", "even, divisible by 3, divisible by 5")
            even += 1
            numberDivisible3 += 1
            numberDivisible5 += 1
            total = inputNumber + total
        elif inputNumber % 2 == 1 and inputNumber % 3 == 0 and inputNumber % 5 == 0:
            print(inputNumber, "is:", "odd, divisible by 3, divisible by 5")
            odd += 1
            numberDivisible3 += 1
            numberDivisible5 += 1
            total = inputNumber + total

# If it fits odd/even and 5.
        elif inputNumber % 2 == 0 and inputNumber % 5 == 0:
            print(inputNumber, "is:", "even,", "divisible by 5")
            even += 1
            numberDivisible5 += 1
            total = inputNumber + total
        elif inputNumber % 2 == 1 and inputNumber % 5 == 0:
            print(inputNumber, "is:", "odd,", "divisible by 5")
            odd += 1
            numberDivisible5 += 1
            total = inputNumber + total

# If it fits odd/even and 3.
        elif inputNumber % 2 == 0 and inputNumber % 3 == 0:
            print(inputNumber, "is:", "even, divisible by 3")
            even += 1
            numberDivisible3 += 1
            total = inputNumber + total
        elif inputNumber % 2 == 1 and inputNumber % 3 == 0:
            print(inputNumber, "is:", "odd, divisible by 3")
            odd += 1
            numberDivisible3 += 1
            total = inputNumber + total

# If its odd/even.
        elif inputNumber % 2 == 0:
            print(inputNumber, "is:", "even")
            even += 1
            total = inputNumber + total
        elif inputNumber % 2 == 1:
            print(inputNumber, "i21s:", "odd")
            odd += 1
            total = inputNumber + total

# Returns statistics.
    print("Statistics Summary")

    print("\t> Number of Evens: ", even)
    print("Percentage of evens: %", format(((even / (even + odd)) * 100), '.1f'), sep='')

    print("\t> Number of Odds:", odd)
    print("\t> Percentage of Odds: %", format(((odd / (odd + even)) * 100), '.1f'), sep='')

    print("\t> Number divisible by 3:", numberDivisible3)
    print("\t> Percentage of numbers divisible by 3: %", format(((numberDivisible3 / (odd + even)) * 100), '.1f'), sep='')

    print("\t> Number divisible by 5:", numberDivisible5)
    print("\t> Percentage of numbers divisible by 5: %", format(((numberDivisible5 / (odd + even)) * 100), '.1f'), sep='')

    print("\t> Sum of all numbers entered:", total)
    print("\t> Average of all integers entered:", format(((total / (odd + even)) * 100), '.1f'), sep='')

else:
    print("ERROR: you must analyze at least 1 integer. Re-run the program please.")













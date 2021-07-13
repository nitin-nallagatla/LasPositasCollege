# Nitin Nallagatla
# Lab 3 - 1


# PART 1:
print("TEMPERATURE CONVERSION CALCULATOR")

# Takes the  Celsius temperature.
celsiusInput = float(input("Enter the temperature in Celsius to get it in Fahrenheit. "))

# Calculates Fahrenheit temperature.
fahrenheitOutput = (celsiusInput * (9 / 5)) + 32

# Returns fahrenheit temperature.
print("The temperature in Fahrenheit is", fahrenheitOutput)


# PART 2:
print("INGREDIENT CALCULATOR")

# Takes the amount of cookies to bake.
cookies = int(input("How many cookies do you want to bake? "))

# Calculates the ingredients needed.
sugarNeeded = cookies * (1.5 / 48)
butterNeeded = cookies * (1 / 48)
flourNeeded = cookies * (3 / 48)

# Returns needed ingredients
print("Here is your shopping list:", "\n"
      "Sugar: ", format(sugarNeeded, '.2f'), "cups", "\n"
      "Butter:", format(butterNeeded, '.2f'), "cups", "\n"
      "Flour: ", format(flourNeeded, '.2f'), "cups")


# PART 3:
# The Various Variables.
print("ORGANIZED VARIABLE GRID")
a = 352.2
b = 542.6
c = 658.64
d = 41.5
e = 9.87
f = 3264.5
g = 748.5
h = 5.65
i = 684.65
a = format(a, '.2f')
b = format(b, '.2f')
d = format(d, '.2f')
f = format(f, '.2f')
g = format(g, '.2f')
# Returns and formats them.
print(a, " ", b, "  ", c, "\n", " ", d, " ", "  ", e, " ", f, "\n", g, "   ", h, "  ", i, sep="")


# PART 4:
print("1 - 10 Roman Numeral Converter:")

# Asks user for input between 1 and 10.
userInput = int(input("Enter a number between one and ten. \n"
                      "We'll give you its Roman Numeral counterpart: "))
# Checks if number is in the range.
if 10 >= userInput >= 1:
    print("The counterpart is:")
    # Checks what number it is and returns the result.
    if userInput == 1:
        print("I")
    elif userInput == 2:
        print("II")
    elif userInput == 3:
        print("III")
    elif userInput == 4:
        print("IV")
    elif userInput == 5:
        print("V")
    elif userInput == 6:
        print("VI")
    elif userInput == 7:
        print("VII")
    elif userInput == 8:
        print("VIII")
    elif userInput == 9:
        print("IX")
    elif userInput == 10:
        print("X")
# If number is not in the range, it will return an error.
else:
    print("That's not valid. Try again.")


# PART 5:
print("AGE AND WEIGHT STATEMENTS")
# Takes all the input.
theirAge = int(input("How old are you? "))
theirWeight = int(input("Hom much do you weigh? "))
spouseAge = int(input("How old is your spouse"))
spouseWeight = int(input("How much does your spouse weigh?"))

# Returns result of age.
if theirAge < spouseAge:
    print("Your spouse is older than you.")
elif theirAge == spouseAge:
    print("You two are the same age.")
elif theirAge > spouseAge:
    print("You are older than your spouse.")
# Returns result of weight.
if theirWeight < spouseWeight:
    print("Your spouse is heavier than you.")
elif theirWeight == spouseWeight:
    print("You two weigh the same amount.")
elif theirWeight > spouseWeight:
    print("You are heavier than your spouse.")

# Nitin Nallagatla
# Lab 2 - 1

# PART ONE:

# Outputs name, address, and phone number.
print("My name is Nitin Nallagatla.",
      "I live at 4443 Valley Avenue, Apt. H",
      "in Pleasanton, CA, 94566.",
      "My home phone number is (804)-332-6934.")


# PART 2:

# Prompts user to enter integers when requested.
print("Enter 5 integers below when prompted. I will give you the sum.")

# Asks for the 5 integers.
input1 = int(input("Enter the first number: "))
input2 = int(input("Enter the second number: "))
input3 = int(input("Enter the third number: "))
input4 = int(input("Enter the fourth number: "))
input5 = int(input("Enter the fifth number: "))

# Adds them together.
inputSum = input1 + input2 + input3 + input4 + input5

# Outputs result
print("The sum of your 5 integers is", inputSum)


# PART 3:

# Asks for sales amount.
salesAmount = float(input("Enter the sales amount to find out your commission.\n"
                          "We'll round to cents if you put more than two decimal values. "))

# Calculates commission.
commission = salesAmount * .15

# Rounds values to cents.
salesAmount = round(salesAmount, 2)
commission = round(commission, 2)

# Outputs commission
print("The sales amount was $", salesAmount, " so your commission was $", commission, ".", sep="")


# PART 4:
try:

    # Takes Input.
    usaStudents = int(input("Please enter the number of students born in the US.\n"
                            "Integers only, as we shouldn't be cutting people in half. "))
    abroadStudents = int(input("Now enter the number of students born abroad. "))

    # Calculates Percentages.
    totalStudents = usaStudents + abroadStudents
    usaPercent = usaStudents / totalStudents
    abroadPercent = abroadStudents / totalStudents

    # Rounds them to two digits.
    usaPercent = round(usaPercent, 4)
    abroadPercent = round(abroadPercent, 4)

    # Multiplies the values by 100 so they can become percentages.
    usaPercent = usaPercent * 100
    abroadPercent = abroadPercent * 100

    # Returns the percentages.
    print("The percentage of US students is %", usaPercent, sep = '')
    print("The percentage of abroad students is %", abroadPercent, sep = '')

    # If the input isn't accepted, the code will return this:
except ValueError:
    print("Are you sure that's an integer? It doesn't seem to work.")




# Lab 5 - 1 - 3
# Nitin Nallagatla | CS7 | Summer 2019


# Calculates average.
def numberAverage(num1, num2, num3):
    average = (num1 + num2 + num3) / 3
    return average


# Starts loop.
userQuit = "NITIN IS SUPERIOR"

# Takes input repeatedly until user wants to stop.
while userQuit != "Q":
    num1 = int(input("Please enter the first number: "))
    num2 = int(input("Please enter the second number: "))
    num3 = int(input("Please enter the third number: "))

    # Calls function for average and returns results.
    average = numberAverage(num1, num2, num3)
    print("The average is ", format(average, '.2f'), ".", sep='')

    userQuit = input("Do you want to quit? \n"
                     "Press Q if you want to, and any other key will keep the function going: ")

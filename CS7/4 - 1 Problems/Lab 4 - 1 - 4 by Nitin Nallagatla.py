# Lab 4 - 1 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

print("TRAVEL TIME CALCULATOR")

# Takes input of distance.
milesToTravel = int(input("How far do you want to travel? In miles, please. "))

# Assigns values to constants.
HOURS_PER_DAY = 10
MPH = 60

# Calculates days based on miles and assumptions in the questions.
hoursToTravel = milesToTravel / MPH
daysToTravel = hoursToTravel / HOURS_PER_DAY

print("You have", format(daysToTravel, '.2f'), "day(s) to travel.")










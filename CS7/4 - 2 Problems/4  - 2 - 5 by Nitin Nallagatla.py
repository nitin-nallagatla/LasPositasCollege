# Lab 4 - 2 Problem 5
# Nitin Nallagatla | CS7 | Summer 2019

print("HOTEL OCCUPANCY CALCULATOR")

# Takes input.
floor = int(input("\t> How many floors do you have? "))

# Sets accumulator variables.
totalRooms = 0
totalOccupied = 0

# Sets up for loop to keep repeating questions.
for i in range(1, (floor + 1)):
    rooms = int(input("\t> Enter number of rooms on floor number %s: " % i))
    occupiedRooms = int(input("\t> How many rooms on this floor are occupied? "))
# Checks validity.
    if rooms >= occupiedRooms:
        # Accumulates total values.
        totalRooms = rooms + totalRooms
        totalOccupied = occupiedRooms + totalOccupied
# Throws error message if not valid.
    else:
        print("That's not valid. Please stop the program and try again.")

# Sets up results block.
print("\t> Here are the results:")

# Calculates the occupancy rate.
totalOccupancyRate = totalOccupied / totalRooms
totalOccupancyRate = totalOccupancyRate * 100

# Returns results.
print("\t> Total Rooms:", totalRooms)
print("\t> Total Occupied Rooms:", totalOccupied)
print("\t> Total Occupancy Rate: ", format(totalOccupancyRate, '.1f'), "%",  sep="")













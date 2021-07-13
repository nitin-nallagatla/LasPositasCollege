# Finals Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

# Imports random and sets constants.
import random

LISTLENGTH = 3


# Defines the program starter. Returns intro text.
# blankSpace is there for the purpose of stopping this function from returning none, or whatever the user enters.
def starter():
    blankSpace = ''
    print("""
This program will generate three lists of three random
numbers (random numbers range: 1000 - 10,000). It will then
create a fourth list that represents the sum of the 
corresponding elements in the three lists.  
    """)
    input("Press ENTER to begin. ")
    return blankSpace


# listMaker creates a list out of random numbers. whenever it is called.
def listMaker():
    theList = []
    for i in range(LISTLENGTH + 1):
        number = random.randint(1000, 10000)
        theList.append(number)
    return theList


# fourthListMaker creates the fourth list, and appends the sum of the indices of each list.
def fourthListMaker(list1, list2, list3):
    list4 = []
    for i in range(LISTLENGTH + 1):
        sumValue = list1[i] + list2[i] + list3[i]
        list4.append(sumValue)
    return list4


# Prints the program starter, and calls list maker to make the three lists and set them equal to variables.
# Then calls fourthListMaker to take the three variables and make the fourth.
print(starter())
list1 = listMaker()
list2 = listMaker()
list3 = listMaker()
list4 = fourthListMaker(list1, list2, list3)

# Returns the formatted output.
print("First list:\t\t", list1)
print("Second list:\t", list2)
print("Third list:\t\t", list3)
print("Summation list:\t", list4)

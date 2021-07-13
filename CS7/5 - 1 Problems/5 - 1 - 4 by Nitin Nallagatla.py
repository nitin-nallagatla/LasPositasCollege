# Lab 5 - 1 - 4
# Nitin Nallagatla | CS7 | Summer 2019

print("INTERACTIVE INPUT RESPONSE")


# Defines function 1.
def choose1():
    print("What do you call a sleeping bull?")
    print("A bulldozer!")


# Defines function 2.
def choose2():
    print("""
    There one was a boy.
    He liked to have fun, but studied when he realized he needed to.
    He grew up, and started a family.
    He lived a successful life.
    Eventually, he died peacefully in the the arms of his loved ones.
        """)


# Defines function 3.
def choose3():
    print("My favorite place on earth is everything within the troposphere.")


# Takes input.
userInput = int(input("Please enter 1, 2, or 3 to make something happen! "))

# Checks user input.
if userInput == 1:
    print(choose1())
elif userInput == 2:
    print(choose2())
elif userInput == 3:
    print(choose3())
else:
    print("What was that? Please try again.")

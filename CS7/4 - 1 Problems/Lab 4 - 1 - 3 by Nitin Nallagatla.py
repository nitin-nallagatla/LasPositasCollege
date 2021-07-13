# Lab 4 - 1 Problem 2
# Nitin Nallagatla | CS7 | Summer 2019

# Announces title and purpose.
print("NAME SIMILARITY CHECK")
print("Give me two names. I'll tell you whether they're the same or not.\n"
      "Fair warning though, I'm case-sensitive.")

# Takes strings as input.
name1 = input("Enter the first name: ")
name2 = input("Enter the second name: ")

if name1 == name2:
    print("They're the same!")
else:
    print("They're not the same.")
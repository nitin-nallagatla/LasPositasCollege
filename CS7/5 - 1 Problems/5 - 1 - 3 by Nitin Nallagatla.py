# Nitin Nallagatla | CS7 | Summer 2019

print("TEST SCORE STATISTICS CALCULATOR")

# Takes for loop input.
noStudents = int(input("Please enter the number of students: "))
noTests = int(input("Please enter the number of tests per student: "))

# Sets up accumulator and highest/lowest variables.
count = 0
total = 0
highest = 0
lowest = 1000

# Outer for loop handles students.
for student in range(1, noStudents + 1):

    # Sets up internal accumulators.
    studentHighest = 0
    studentLowest = 1000
    studentTotal = 0
    studentCount = 0

    # Inner for loop handles tests.
    for test in range(noTests):

        # Gets test score input.
        testScore = float(input("Please enter the test score for student %s: " % student))

        # Adds to individual accumulators and counters.
        studentTotal = testScore + studentTotal
        studentCount += 1

        # Adds to  overall accumulators and counters.
        total = testScore + total
        count += 1

        # Changes highest and lowest as necessary.0
        if testScore < studentLowest:
            studentLowest = testScore
        if testScore > studentHighest:
            studentHighest = testScore
        if testScore < lowest:
            lowest = testScore
        if testScore > highest:
            highest = testScore

    # Returns the individual results.
    print("The highest score for this student is ", studentHighest, " points.", sep="")
    print("The lowest score for this student is ", studentLowest, " points.", sep="")
    print("This student's average is ", format(studentTotal / studentCount, '.2f'), " points.\n", sep="")

# Returns overall results.
print("The overall highest score is ", highest, " points.", sep="")
print("The overall lowest score is ", lowest, " points.", sep="")
print("The overall average is ", format(total / count, '.2f'), " points.", sep='')
# Lab 5 - 1 - 2
# Nitin Nallagatla | CS7 | Summer 2019

import random

print("SAMPLE CLOCK DISPLAY")

# For loop calculates hours.
for n in range(1):
    randomHours = random.randint(1, 12)

    # For loop calculates minutes.
    for i in range(1):
        randomMinutes = random.randint(1, 59)

        # Calculates seconds and adds ten seconds to previous counts for 6 displays per minute.
        for t in range(6):
            print(format(randomHours, '02d'), ":", format(randomMinutes, '02d'), ":", format(randomSeconds, '02d'), sep='')
            randomSeconds = randomSeconds + 10

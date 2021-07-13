# Lab 5 - 1 - 5
# Nitin Nallagatla | CS7 | Summer 2019

print("TEMPERATURE CONVERTER")


def fahrenheitToCelsius(fahrenheitTemp):
    celsiusTemp = (fahrenheitTemp - 32) * (5/9)
    return celsiusTemp


userQuit = 'NITIN'

while userQuit != 'Q':
    fahrenheitTemp = float(input("Please enter the temperature in fahrenheit: "))
    celsiusTemp = fahrenheitToCelsius(fahrenheitTemp)
    print("The celsius temperature is ", format(celsiusTemp, '.2f'), " degree(s).", sep='')
    userQuit = input("Do you want to quit? \n"
                     "Press Q if you want to, and any other key will keep the function going: ")

























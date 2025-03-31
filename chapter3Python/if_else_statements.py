number1 = int(input('Enter a number: '))
number2 = int(input('Enter another number: '))

if number1 == number2:
    print(number1, 'is equal to ', number2)
else:
    print(number1, 'is not equal to ', number2)

if number1 > number2:
    print(number1, 'is greater than ', number2)
else:
    print(number1, 'is less than ', number2)

if number1 <= number2:
    print(number1, 'is less than and equal to ', number2)
else:
    print(number1, 'is greater than and equal to ', number2)
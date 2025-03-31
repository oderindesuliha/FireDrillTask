number = int(input("Enter a number: "))
divisor =  10000
for digits in range(5):
    print(number//divisor, end=' ')
    number %= divisor
    divisor //= 10


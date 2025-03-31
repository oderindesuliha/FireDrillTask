number = int(input("Enter a five-digit integer: "))

first_digit = number // 10000
second_digit = (number // 1000) % 10
fourth_digit = (number // 10) % 10
fifth_digit = number % 10

if first_digit == fifth_digit and second_digit == fourth_digit:
    print("The number is a palindrome.")
else:
    print("The number is not a palindrome.")

largest = 0
second_largest = 0
for numbers in range(10):
    number = int(input('Enter number:'))
    if number > largest:
        second_largest = largest
        largest = number
    if number < largest and number > second_largest:
        second_largest = number


print(largest)
print(second_largest)

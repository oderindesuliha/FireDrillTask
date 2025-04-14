user_input = int(input('Enter base length:'))
for asterisks in range(1, user_input + 1):
    for number in range(asterisks):
        print('*', end='')
    print()
print()

for number in range(user_input, 0, -1):
    for index in range(number):
        print('*', end='')
    print()
print()

for number in range(1,user_input):
    for asterisks in range(1,number):
        for index in range(number, user_input):
             print('*', end='')
    print()
print()

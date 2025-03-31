passes = 1
failures = 0
counter = 0

for students in range(1, 11):
    result = int(input('Enter a number(pass = 1, fail = 2): '))

    while result != 1 and result != 2:
        print('Invalid input')
        result = int(input('Enter a number(pass = 1, fail = 2): '))

    if result == passes and result == 1:
        counter += 1
        print("Passes: ", counter)

    else:
        failures += 1


print("Failures: ", failures)



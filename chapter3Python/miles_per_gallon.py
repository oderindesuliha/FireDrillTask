total_miles = 0
count = 0
gallons_used = 0
miles_gallon = 0
while gallons_used != -1:
    gallons_used = float(input(f'Gallon {count + 1} (-1 to end): '))
    miles_driven = float(input(f'miles driven {count + 1}: '))

    print(f'The miles/gallon{count + 1} for this tank was {miles_driven // gallons_used}')

total_miles += miles_gallon
average = total_miles // count

print(f'The overall total miles/gallon was {total-miles}')
print(f'The overall average miles/gallon was {average}')
import statistics

numbers=[9,11,22,34,17,22,34,22,40]
sorted_numbers=sorted(numbers)
print(sorted_numbers)
mean = sum(numbers) / len(numbers)
print("The mean of numbers is:", mean)
median = statistics.median(sorted_numbers)
print("The median of numbers is:", median)
mode = statistics.mode(numbers)
print("The mode of numbers is:", mode)
numbers.insert(2,34)
sorted_numbers = sorted(numbers)
print(sorted_numbers)
mean =statistics.mean(numbers)
print("The mean of numbers after 34 is added is:", mean)
median = statistics.median(numbers)
print("The median of numbers after 34 is added is:", median)
mode = statistics.mode(numbers)
print("The mode of numbers after 34 is added is:", mode)


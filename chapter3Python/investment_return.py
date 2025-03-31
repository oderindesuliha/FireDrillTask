for count in range(1, 31):
    principal = 1000
    return_rate =  7 / 100
year = 10
amount = principal * (1 + return_rate) ** year
print(f"The amount in 10years is {amount}")
principal = 1000
rate = 0.07


for year in range(1, 31):
    principal += principal * rate
    print(f"Year {year}: {principal:.2f}")

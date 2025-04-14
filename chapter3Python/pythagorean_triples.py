print("side1\t\tside2\t\thypotenuse")
for side1 in range(1,21):
    for side2 in range(1,21):
        for hypotenuse in range(1,21):
            if side1**2 + side2**2 == hypotenuse**2:
                print(f"{side1}\t\t\t{side2}\t\t\t{hypotenuse}")



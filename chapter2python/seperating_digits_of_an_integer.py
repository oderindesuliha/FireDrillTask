number = int(input("Enter a number: "))
fifthnum = number % 10
fournumbers = number // 10

fourthnum = fournumbers % 10
threenumbers = fournumbers // 10

thirdnum = threenumbers % 10
twonumbers = threenumbers // 10

secondnum = twonumbers % 10
firstnum = twonumbers // 10

print(firstnum, secondnum, thirdnum, fourthnum, fifthnum)

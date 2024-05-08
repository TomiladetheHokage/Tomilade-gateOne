


def even_Numbers (numbers):
	even_Numbers = []

	for counter in range(len(numbers) ):
		count = 0
		if numbers[counter] % 2 == 0:
			even_Numbers.append(numbers) 

	return even_Numbers
					


numbers = [1,2,3,4,5,6,7]

print(even_Numbers(numbers))
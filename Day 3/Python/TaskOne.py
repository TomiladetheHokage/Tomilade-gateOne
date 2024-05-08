import random

correct_Answers = 0
wrong_Answers = 0

random_Number = 0
second_Random_Number = 0

for counter in range (10):
	random_Number = random.randint(0,10)
	second_Random_Number = random.randint(0,17)
	answer = random_Number + second_Random_Number

	question = int(input(f'What is {random_Number} + {second_Random_Number}? ')) 

	if question == answer:
		correct_Answers = correct_Answers + 1

	else:
		wrong_Answers = wrong_Answers + 1

print(f'You got {correct_Answers} correctly')
print(f'You got {wrong_Answers} wrongly')

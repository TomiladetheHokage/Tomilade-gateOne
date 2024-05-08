

Score_Counter = 0
sum_Of_Scores = 0
number_Of_Students = 10
even_Number = 2
sum_Of_Even_Numers = 0
number_of_Even_Numbers = 0

while Score_Counter < 10:

	score = int(input("Enter a score: "))

	sum_Of_Scores  += score;

	Score_Counter = Score_Counter + 1

	if score % even_Number == 0:
		sum_Of_Even_Numers += score
		number_of_Even_Numbers = number_of_Even_Numbers + 1




average = sum_Of_Even_Numers / number_of_Even_Numbers


print(f'The average of even numbers is {average:.2f}');
print(f'The sum of even numbers is {sum_Of_Even_Numers}');


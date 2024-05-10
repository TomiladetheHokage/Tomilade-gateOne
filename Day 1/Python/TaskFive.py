

Score_Counter = 0
sum_Of_Scores = 0
number_Of_Students = 10
even_Number = 2
sum_Of_Even_Numers = 0

while Score_Counter < 10:

	score = int(input("Enter a score: "))

	sum_Of_Scores  += score;

	Score_Counter = Score_Counter + 1

	if score % even_Number == 0:
		sum_Of_Even_Numers += score

average = sum_Of_Scores / number_Of_Students


print(f'The sum of even numbers is {sum_Of_Even_Numers}');


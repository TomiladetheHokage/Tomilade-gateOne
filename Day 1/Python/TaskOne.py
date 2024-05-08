

Score_Counter = 0
sum_Of_Scores = 0

while Score_Counter < 10:

	score = int(input("Enter a score: "))

	sum_Of_Scores += score;

	Score_Counter = Score_Counter + 1


print(f'The sum of scores collected is {sum_Of_Scores}');



Score_Counter = 0
sum_Of_Scores = 0
number_Of_Students = 10

while Score_Counter < 10:

	score = int(input("Enter a score: "))

	sum_Of_Scores  += score;

	Score_Counter = Score_Counter + 1

average = sum_Of_Scores / number_Of_Students


print(f'The average of scores collected is {average}');
print(f'The sum of scores collected is {sum_Of_Scores}');

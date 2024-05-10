

Score_Counter = 0
sum_Of_Scores = 0
number_Of_Students = 10
even_Index = 2
sum_Of_Even_Indexes = 0

while Score_Counter < 10:

	score = int(input("Enter a score: "))

	sum_Of_Scores  += score;

	Score_Counter = Score_Counter + 1

	if Score_Counter % even_Index == 0:
		sumOfEvenIndexes += score

average = sum_Of_Scores / number_Of_Students


print(f'The sum of even index is {sum_Of_Even_Indexes}');


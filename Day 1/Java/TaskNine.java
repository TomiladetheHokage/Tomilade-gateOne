import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int ScoreCounter = 0;
int sumOfScores = 0;
int numberOfStudents = 10;
int evenNumber = 2;
int sumOfEvenNumbers = 0;
int numberOfEvenNumbers = 0;

while (ScoreCounter < 10){

System.out.print("Enter a score: ");

int score = input.nextInt();
if (score < 1 || score > 100){

System.out.print("Enter valid score\n");

-- ScoreCounter;
}
 

else {
sumOfScores += score;
}

ScoreCounter++;

if(score % evenNumber == 0){
 sumOfEvenNumbers += score;
numberOfEvenNumbers ++;
}
}

double average = sumOfEvenNumbers / numberOfEvenNumbers;


System.out.print("\nThe sum of the numbers is "+ sumOfScores);



}
}
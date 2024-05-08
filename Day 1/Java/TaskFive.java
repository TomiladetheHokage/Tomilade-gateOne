import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int ScoreCounter = 0;
int sumOfScores = 0;
int numberOfStudents = 10;
int evenNumber = 2;
int sumOfEvenNumbers = 0;
while (ScoreCounter < 10){

System.out.print("Enter a score: ");
int score = input.nextInt();

sumOfScores += score;

ScoreCounter++;

if(score % evenNumber == 0) sumOfEvenNumbers += score;

}

double average = sumOfScores / numberOfStudents;


System.out.print("The sum of the even indexes is "+ sumOfEvenNumbers);



}
}
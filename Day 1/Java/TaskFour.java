import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int ScoreCounter = 0;
int sumOfScores = 0;
int numberOfStudents = 10;
int evenIndex = 2;
int sumOfEvenIndexes = 0;
while (ScoreCounter < 10){

System.out.print("Enter a score: ");
int score = input.nextInt();

sumOfScores += score;

ScoreCounter++;

if(ScoreCounter % evenIndex == 0) sumOfEvenIndexes += score;

}

double average = sumOfScores / numberOfStudents;


System.out.print("The sum of the even indexes is "+ sumOfEvenIndexes);



}
}
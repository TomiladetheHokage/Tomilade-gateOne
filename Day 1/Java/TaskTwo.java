import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int ScoreCounter = 0;
int sumOfScores = 0;
int numberOfStudents = 10;

while (ScoreCounter < 10){

System.out.print("Enter a score: ");
int score = input.nextInt();

sumOfScores += score;

ScoreCounter++;
}

double average = sumOfScores / numberOfStudents;


System.out.print("The average of scores collected is "+ average);


}
}
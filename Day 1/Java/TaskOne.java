import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int ScoreCounter = 0;
int sumOfScores = 0;

while (ScoreCounter < 10){



System.out.print("Enter a score: ");
int score = input.nextInt();

if (score == -1){
break;
}

sumOfScores += score;

ScoreCounter++;
}

System.out.print("The sum of scores collected is "+ sumOfScores);


}
}
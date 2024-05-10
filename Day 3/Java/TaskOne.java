import java.util.Scanner;
import java.util.Random;
public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner (System.in);

Random random = new Random();

int correctAnswers = 0;
int wrongAnswers = 0;

int randomNumber = 0;
int randomSecondNumber = 0;


for (int counter = 0; counter < 10; counter++){

randomNumber = random.nextInt(17);
randomSecondNumber = random.nextInt(10);


int answer = randomNumber + randomSecondNumber;

System.out.print("What is "+randomNumber+ " + "+ randomSecondNumber+ " ? ");
int questionAnswer = input.nextInt();

	if (questionAnswer == answer){
	correctAnswers++;
	}

	else if (questionAnswer != answer){
	wrongAnswers++;
	}
		}

System.out.print("You got "+ correctAnswers+ " correctly\n");
System.out.print("You got "+ wrongAnswers+ " wrong");

}
}



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



String [] operators = {"*", "+", "-", "/", "%","*", "+", "-", "/", "%"};


for( int count = 0; count < 2; count++){

randomNumber = random.nextInt(17);
randomSecondNumber = random.nextInt(10);

System.out.print("What is "+randomNumber+ operators[count] + randomSecondNumber+ " ? ");
String questionAnswer = input.next();

String answer = randomNumber + operators [count] + randomSecondNumber;

	if (questionAnswer.equal(answer)){
	correctAnswers++;
	}

	else if (!questionAnswer.equals(answer)){
	wrongAnswers++;
	}
		}


System.out.print("You got "+ correctAnswers+ " correctly\n");
System.out.print("You got "+ wrongAnswers+ " wrong");

}
}



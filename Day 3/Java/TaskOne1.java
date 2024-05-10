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



String [] operators = {"*", "+", "-", "/", "%"};


for( int count = 0; count < 5; count++){

randomNumber = random.nextInt(17);

randomSecondNumber = random.nextInt(10);

String operator = operators[random.nextInt(5)];

System.out.print("What is "+ randomNumber + operator + randomSecondNumber+ " ? ");
int questionAnswer = input.nextInt();

int answer = 0;

switch(operator){

	case "+": 
	answer = randomNumber  + randomSecondNumber;
	break;

	case "-": 
	answer = randomNumber  - randomSecondNumber;
	break;

	case "*": 
	answer = randomNumber  * randomSecondNumber;
	break;

	case "/": 
	answer = randomNumber  / randomSecondNumber;
	break;

	case "%": 
	answer = randomNumber  % randomSecondNumber;
	break;
}

	if (questionAnswer == answer){
	correctAnswers++;
	}

	else {
	wrongAnswers++;
	}
		}


System.out.print("You got "+ correctAnswers+ " correctly\n");
System.out.print("You got "+ wrongAnswers+ " wrong");

}
}


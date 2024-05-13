import java.util.Scanner;

public class CreditValidator {

public static void main(String[] args){

Scanner input = new Scanner(System.in);
	
	int doubledSecondDigit = 0;
	int firstDigit = 0;
	int secondDigit =0;
	int result = 0;
	int sumofSingleDigits = 0;
	int sum = 0;
	int sumofdoubledSecondDigit = 0;
	int sumTotal = 0;


	System.out.print("Hello, kindly Enter card details to verify \n"); 
	String cardNumber = input.nextLine();
	
	int [] collectingNumber = new int[cardNumber.length()];	

	if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {

	for(int i = 0; i < cardNumber.length(); i += 2){	

	collectingNumber[i] = cardNumber.charAt(i) - '0';
	
	doubledSecondDigit = collectingNumber[i] * 2;
	
	sumofdoubledSecondDigit += doubledSecondDigit;
	
	if(doubledSecondDigit >= 10) {
	while(doubledSecondDigit != 0) {
	result = doubledSecondDigit % 10;
	sum = sum + result;
	doubledSecondDigit /= 10;
	}
		} 
	}
	sumTotal = sumofdoubledSecondDigit + sum;

	//System.out.print(sumTotal);

	char cardNumberFirstDigit = cardNumber.charAt(0);
	char cardNumberSecondDigit = cardNumber.charAt(1);

		

	if (cardNumberFirstDigit == '4') System.out.print("Credit card type: Visacard\n");
	
	else if(cardNumberFirstDigit == '5') System.out.print("Credit card type: Master card\n");
	
	else if(cardNumberFirstDigit == '6') System.out.print("Credit card type: Discover card\n");
	
	else if(cardNumberFirstDigit == '3' && cardNumberSecondDigit == '7') System.out.print("Credit card type: American express card\n");
	
	System.out.print("Credit card Number: " + cardNumber + "\n");

	System.out.print("Credit card Digit length: " + cardNumber.length() + "\n");

	if (sumTotal % 10 == 0) System.out.println("Credit card validity status: Valid");
	else  System.out.print("Credit card validity status: Invalid"); 
}
	else System.out.println("Put correct number jare\nWerey wan scam me");
		

			
	
	
	
 }
	

}
		
	
	

	




//4388576018402626
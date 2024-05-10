import java.util.Scanner;
public class TaskOne{
public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a card number ");
String cardNumber = input.nextLine();


boolean result = TaskOne.cardNumber(cardNumber);

System.out.print(result);
}


public static boolean cardNumber(String cardNumber){

char firstDigit = cardNumber.charAt(0);

int lengthOfCard = cardNumber.length();

if (firstDigit == '4' && firstDigit == '5' && firstDigit == '6' && lengthOfCard == 16 ){
 return true;
}
else if (lengthOfCard < 16 && lengthOfCard > 16 ){
 
}return false;



}
}
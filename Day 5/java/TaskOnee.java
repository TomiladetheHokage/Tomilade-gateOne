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
char fourthCharacter = cardNumber.charAt(4);
char ninthCharacter = cardNumber.charAt(9);
char fourteenthCharacter = cardNumber.charAt(14);

int length = cardNumber.length();

if (firstDigit == '4' && firstDigit == '5' && firstDigit == '6' || fourthCharacter == '-' || ninthCharacter == '-' || fourteenthCharacter == '-'){


 return true;

}
else if (length < 16 && length > 16){
 
}return false;



}
}
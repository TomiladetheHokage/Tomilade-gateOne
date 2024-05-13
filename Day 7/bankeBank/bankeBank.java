import java.util.Scanner;
public class bankeBank {
public static void main(String[] args){

Scanner input = new Scanner (System.in);

String bank = """

=============
BANKE BANK
=============

1. Create an account 
2. Close account 
3. Deposit money
4. Withdraw Money
5. Check Account balance
6. Transfer from one account to another
7. Change pin

""";


System.out.print(bank);
int userSelection = input.nextInt();

while(userSelection != 8 ){

if (userSelection == 1){
System.out.print("Please select your country for opening account: ");
String country = input.next();

if (country.equals("Nigeria")){

System.out.print("Enter your email address: ");
String email = input.next();
char reuslt = email.charAt(email.length() - 1);

	while(reuslt != 'm'){
	System.out.print("Invalid email address ");
	email = input.next();
	reuslt = email.charAt(email.length() - 1);
		
			}
	

System.out.print("What is your full name?  ");
String name = input.next();

System.out.print("What is your tel-phone number:");
String number = input.next();
System.out.print(" ");
 //number = input.next();

	if (number.length() > 11){
	System.out.print("Invalid phone number");
			}

System.out.print("What is your address  ");
String address = input.next();

System.out.print("Please your bvn  ");
String bvn = input.next();

	if (bvn.length() > 11){
	System.out.print("Invalid bvn number");		
		}

System.out.print("Please your NIN  ");
String nin = input.next();

	if (nin.length() > 11){
	System.out.print("Invalid NIN number");		
		}

System.out.print("Choose a unique username ");
String username = input.next();

System.out.print("Choose a unique password ");
String password = input.next();




}
else{ System.out.print("Our services are only available in Nigeria");}
}





	}





}
}
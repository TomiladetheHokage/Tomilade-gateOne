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

String terms = """
	TERMS AND CONDITIONS
1. We will not be liable to any loss of funds
2. We do not permit any crypto transactions
3. Minimum deposit is a 10k
4. There will be weekly charges of 5k for maintanace
5. Transaction charges vary depending on mood (#500 - #1000);
Do you agree to the following terms and conditions YES/NO.

""";

System.out.print(bank);
int userSelection = input.nextInt();



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

System.out.print("What is your tel-phone number: ");
String number = input.nextLine();
input.nextLine();

	if (number.length() > 11){
	System.out.print("Invalid phone number");
			}

System.out.print("What is your address  ");
String address = input.next();

System.out.print("Please your bvn");
String bvn = input.nextLine();
System.out.print(" ");
bvn = input.next();

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
input.nextLine();
System.out.print("Confirm password ");
String confirmPassword = input.next();

	while(!password.equals(confirmPassword)){
		System.out.print("Password miss match ");
		System.out.print("Choose a unique password ");
		password = input.next();
		System.out.print("Confirm password ");
		confirmPassword = input.next();
			} 

System.out.print("\n"+terms);
String answer = input.next();

	if(answer.equalsIgnoreCase("yes")){
	System.out.print("Account succesfully created\nPlease email your utility bill to the bankebank@gmail.com address\nOr drop it off at any branch");
		}
	else {System.out.print("Commot here abeg");}


}

else if (userSelection == 2) System.out.print("Are you sure you want to close this account?");

//else{ System.out.print("Our services are only available in Nigeria");}













	}





}
}
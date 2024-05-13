import java.util.Scanner;
public class bankeBank {
private static int deposit = 0;
public static void main(String[] args){

Scanner input = new Scanner (System.in);



String bankMenu = """

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

System.out.print(bankMenu);
int userSelection = input.nextInt();

switch (userSelection){

case 1: bankMenu();
break;

case 2: closeAccount();
break;

case 3: depositMoney();
break;

case 4: withdrawMoney();
break;
}
}

public static String menu(){
String bankMenu = """

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

return bankMenu;
}



public static void bankMenu(){

Scanner input = new Scanner (System.in);


System.out.print("Please select your country for opening account: ");
String country = input.nextLine();

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

String terms = """
	TERMS AND CONDITIONS
1. We will not be liable to any loss of funds
2. We do not permit any crypto transactions
3. Minimum deposit is a 10k
4. There will be weekly charges of 5k for maintanace
5. Transaction charges vary depending on mood (#500 - #1000);
Do you agree to the following terms and conditions YES/NO.

""";

System.out.print("\n"+terms);
String answer = input.next();

	if(answer.equalsIgnoreCase("yes")){
	System.out.print("Account succesfully created\nPlease email your utility bill to the bankebank@gmail.com address\nOr drop it off at any branch\n");
		}

	
	else {System.out.print("Commot here abeg");
		}


}


else { System.out.print("Our services are only available in Nigeria");}
System.out.print(menu());
	int menuOption = input.nextInt();
	switch (menuOption){
		case 1: bankMenu();
break;

case 2: closeAccount();
break;

case 3: depositMoney();
break;

case 4: withdrawMoney();
break;
	
	
		}
}



public static void closeAccount(){

Scanner input = new Scanner (System.in);

System.out.print("Are you sure you want to close this account? YES/NO ");
String accountClose = input.next();

	while(!accountClose.equalsIgnoreCase("yes") && !accountClose.equalsIgnoreCase("no")){
	System.out.print("Please enter YES/NO ");
	accountClose = input.next();
		}
	
	if (accountClose.equalsIgnoreCase("yes")){
	System.out.print("Oya sope otilo\n");
	System.out.print("ACCOUNT CLOSED");
			}
	
	else if (accountClose.equalsIgnoreCase("no")){
	System.out.print(menu());
	int userChoice = input.nextInt();

	switch(userChoice){
		case 1: bankMenu();
break;

case 2: closeAccount();
break;

case 3: depositMoney();
break;

case 4: withdrawMoney();
break;
		default:
                System.out.println("Invalid selection");
		}

}
}

public static void depositMoney(){
Scanner input = new Scanner (System.in); 

System.out.print("How much do you want to deposit? ");
int depositAmount = input.nextInt();
 deposit = deposit + depositAmount;

if (depositAmount > 1000){
System.out.print("Omo olowooooo wow \n");
}

System.out.print("#"+depositAmount+" Succesfully deposited");
System.out.print(menu());
	int userChoice = input.nextInt();

	switch(userChoice){
		case 1: bankMenu();
			break;
		case 2: closeAccount();
			break;
		case 3: depositMoney();
			break;
		default:
                System.out.println("Invalid selection");
		}


}
public static void withdrawMoney(){
Scanner input = new Scanner (System.in); 

System.out.print("How much do you want to withdraw? ");
int withdrawAmount = input.nextInt();

if (withdrawAmount > deposit){

System.out.print("Omo 0 funds. Please deposit ");
}






}
}

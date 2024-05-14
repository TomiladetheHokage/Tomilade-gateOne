import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bankeBank {
private static int deposit = 0;
private static String pin;

private static List<String> userData = new ArrayList<>();

Scanner input = new Scanner (System.in);

public static void main(String[] args){
menu();
}


public static void menu(){
Scanner input = new Scanner (System.in);
String menu = """

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
System.out.print(menu);
int userSelection = input.nextInt();

switch(userSelection){

case 1: bankMenu();
break;

case 2: closedAccount();
break;

case 3: depositMoney();
break;

case 4: withdrawMoney();
break;

case 5: checkBalance();
break;

case 6: transfer();
break;

case 7: changePin();
break;

}
}

public static void bankMenu() {
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

System.out.print("Enter first name?  ");
String firstName = input.next();

System.out.print("Enter last name?  ");
String lastName = input.next();


System.out.print("Choose a unique username ");
String username = input.next();

System.out.print("Choose a unique pin ");
 pin = input.next();
input.nextLine();
System.out.print("Confirm pin ");
String confirmPin = input.next();

	while(!pin.equals(confirmPin)){
		System.out.print("Password miss match ");
		System.out.print("Choose a unique password ");
		pin = input.next();
		System.out.print("Confirm password ");
		confirmPin = input.next();
			} 

userData.add(String.format("%s%s%s%s%s",email, firstName, lastName, username, pin));

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
else  System.out.print("Our services are only available in Nigeria");

menu();
}


public static void closedAccount(){
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

	menu();
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

menu();
}

public static void withdrawMoney(){
Scanner input = new Scanner (System.in); 

System.out.print("How much do you want to withdraw? ");
int withdrawAmount = input.nextInt();

if (withdrawAmount > deposit){

System.out.print("Omo 0 funds. Please deposit ");
}
 else { deposit -= withdrawAmount;
System.out.print("#"+withdrawAmount+" funds succesfully withdrawn");
}

menu();

}

public static void checkBalance(){
Scanner input = new Scanner (System.in); 

System.out.print("#"+deposit);

if (deposit > 1000){
System.out.print("Odogwu! ");
}

menu();

}
public static void transfer(){
Scanner input = new Scanner (System.in); 

System.out.print("What bank do u want to transfer too? ");
String transfer = input.nextLine();

System.out.print("What is the account number? ");
String aza = input.nextLine();

System.out.print("How much are you sending ?");
String moneySent = input.nextLine();

if(Integer.parseInt(moneySent) > deposit){
System.out.print("Werey wan scam me");
}
else {
deposit = deposit - Integer.parseInt(moneySent);
}

menu();

}

public static void changePin(){

Scanner input = new Scanner (System.in); 
System.out.print("Enter current pin ");
String pin = input.nextLine();

while (!pin.equals(pin)){
System.out.print("Invalid");
System.out.print("Enter current pin ");
 pin = input.nextLine();
if (pin.equals(pin)){
break;
}
}

System.out.print("Enter new pin ");
String newPin = input.nextLine();

menu();


}

}















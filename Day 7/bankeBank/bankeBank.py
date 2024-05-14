user_data = []
def menu():
	print("""
===========
BANKE BANK
===========

1. Create an account 
2. Close account 
3. Deposit money
4. Withdraw Money
5. Check Account balance
6. Transfer from one account to another
7. Change pin
""") 

	user_selection = int(input('Enter your choice: '))
	if user_selection == 1:
		bank_menu()

def bank_menu():
	first_name = str(input('Enter first name? '))
	last_name = str(input('Enter first name? '))
	pin = str(input('Enter first name? '))
	
	user_data.append(first_name)
	user_data.append(last_name)
	user_data.append(pin)
	menu()

menu()

def closed_account():
	account_close = str(input('Are you sure you want to close this account? YES/NO '))
	while account_close != 'yes' && account_close != 'no':
		print

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
	elif user_selection == 2:
		closed_account()
	elif user_selection == 3:
		deposit()

def bank_menu():
	first_name = str(input('Enter first name? '))
	last_name = str(input('Enter last name? '))
	pin = str(input('Enter pin '))
	
	user_data.append(first_name)
	user_data.append(last_name)
	user_data.append(pin)
	menu()

def closed_account():
	account_close = str(input('Are you sure you want to close this account? YES/NO '))
	while account_close != 'yes' and account_close != 'no':
		print('Please enter yes or no')
		account_close = str(input('Are you sure you want to close this account? YES/NO '))

	if account_close == 'yes':
		pin = str(input('Enter pin '))
		
		if len(user_data) >= 3 and pin == user_data[2]:
        		print('Account closed successfully.')
		else:
			print('Account not found\nplease open one or try the password again')

	
	menu()

def deposit():
	pin = str(input('Enter pin '))
	
	if len(user_data) >= 3 and pin == user_data[2]:
		amount_deposit = int(input('How much do you want to deposit '))
		account_balance = 0
		account_balance = account_balance + amount_deposit 
		print(f' #{amount_deposit} succesfully deposited')
	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')
	
	menu()
		

menu()
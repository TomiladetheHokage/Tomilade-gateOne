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
	elif user_selection == 4:
		withdraw()
	elif user_selection == 5:
		check_balance()
	elif user_selection == 6:
		transfer()
	elif user_selection == 7:
		change_pin()
def bank_menu():
	first_name = str(input('Enter first name? '))
	last_name = str(input('Enter last name? '))
	pin = str(input('Enter pin '))

	print('Account succesfully created')
	
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

		global account_balance 

		account_balance = 0
		account_balance = account_balance + amount_deposit 
		print(f' #{amount_deposit} succesfully deposited')
	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')
	
	menu()

def withdraw():
	pin = str(input('Enter pin '))
	
	if len(user_data) >= 3 and pin == user_data[2]:
		withdraw = int(input('How much do you want to withdraw '))

		global account_balance 

		if withdraw > account_balance:
			print("No funds. please deposit")
		else:
			account_balance = account_balance - withdraw
			print(f' #{withdraw} succesfully withdrawn')
			
	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')

	menu()

def check_balance():
	pin = str(input('Enter pin '))
	
	if len(user_data) >= 3 and pin == user_data[2]:
		global account_balance

		print(f' Your account balance is #{account_balance}')

	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')

	
	menu()

def transfer():
	pin = str(input('Enter pin '))
	
	if len(user_data) >= 3 and pin == user_data[2]:
		global account_balance

		bank = str(input('What bank do you want to transfer too? '))
		account_number = str(input('What is the account number '))
		transfer_amount = int(input('How much are you sending? ')) 

		if transfer_amount > account_balance:
			print("Werey wan scam bank")
		else:
			account_balance = account_balance - transfer_amount
			print(f' #{transfer_amount} has succesfully been sent')

	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')

	
	menu()

def change_pin():
	pin = str(input('Enter pin '))
	
	if pin in user_data:
		current_pin = str(input('Enter current pin '))
		if current_pin == pin:
			new_pin = str(input('Enter new pin '))
			user_data[2] = new_pin
			print('PIN succesfully changed')
		else:
			print('Invalid pin. please try password again')
	else:
		print('Invalid pin. Create an account and set a pin. If you already have an account please try the password again')
	
	menu()



	
	


menu()

		

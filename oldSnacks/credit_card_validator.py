sum_of_doubled_SecondDigit = 0
total = 0
result = 0
sum_Total = 0

card_Details = str(input('Enter your credit card details '))
card_number = [0] * len(card_Details)


if len(card_Details) >= 13 and len(card_Details) <= 16:

	for i in range(0, len(card_Details), 2):
		card_number[i] = int(card_Details[i])
		doubled_second_digits = card_number[i] * 2
		sum_of_doubled_SecondDigit += doubled_second_digits

		if doubled_second_digits >= 10:
			while doubled_second_digits != 0:
				result = doubled_second_digits % 10
				total = total + result
				doubled_second_digits //= 10

		sum_Total = sum_of_doubled_SecondDigit + total


		card_number_first_digit = card_number[0]
		card_number_second_digit = card_number[1]


		if card_number_first_digit == 4:
			print('Credit card type: Visacard\n') 
		elif card_number_first_digit == 5:	
			print('Credit card type: Master card\n') 
		elif card_number_first_digit == 6:	
			print('Credit card type: Discovery card\n') 
		elif card_number_first_digit == 3 and int(card_Details[1]) == 7:
			print('Credit card type: American express card\n') 

		print('Credit card number: ' + card_Details + '\n')
		print('Credit card digit length: '+str(len(card_Details)) + '\n')

		if sum_Total % 10 == 0:
			print ('Credit card validity status: Valid')
		elif sum_Total % 10 != 0:
			print ("Credit card validity status: Invalid")

else:
	print('Put correct number jare\nWerey wan scam me')


	
	












# 4388576018402626

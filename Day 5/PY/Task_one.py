card_number = str(input("Enter a card number "));


def  card_validator(card_number):
	first_digit = card_number[0]
	length_of_card_digit = len(card_number)

	if first_digit == '4' and first_digit == '5' and first_digit == '6' and length_of_card_digit == 16:
		return True
	else:
		return False
		
 



print(card_validator(card_number))


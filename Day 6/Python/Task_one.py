

def caculate_age(birth_date):

	day, month, year = map(int, birth_date.split('/'))

	current_year = 2024
	current_month = 5
	current_day = 12

	age = current_year - year - ((current_month, current_day) < (month, day))
	return age



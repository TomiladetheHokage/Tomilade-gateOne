from datetime import datetime, timedelta

def get_date_input(prompt_message):
    while True:
        date_str = input(prompt_message)
        try:
            date_obj = datetime.strptime(date_str, "%Y-%m-%d")
            return date_obj
        except ValueError:
            print("Invalid format. Please enter the date in YYYY-MM-DD")

period_start_date = get_date_input("When did your last period start? (YYYY-MM-DD) ")

print("Your last period started on:", period_start_date.strftime("%A, %B %d, %Y"))

ask_user_if_knows_period_length = input("Do you know how long your period lasts? ").lower()

if ask_user_if_knows_period_length == 'yes':
    period_length = int(input("How long does your period last? "))
else:
    period_length = 5

while True:
    ask_user_if_knows_period_cycle = input("Do you know how long your cycle is? ").lower()
    
    if ask_user_if_knows_period_cycle not in ['yes', 'no']:
        print('Please enter yes or no')
        continue
    
    if ask_user_if_knows_period_cycle == 'yes':
        cycle_length = int(input("How long does your cycle last? "))
        next_flow = period_start_date + timedelta(days=cycle_length)
        ovulation_date = period_start_date + timedelta(days=14)
    else:
        cycle_length = 28
        next_flow = period_start_date + timedelta(days=cycle_length)
        ovulation_date = next_flow - timedelta(days=12)

    fertility_start = ovulation_date - timedelta(days=5)
    fertility_end = ovulation_date + timedelta(days=2)
    safe_period_start = ovulation_date + timedelta(days=5)
    safe_period_end = next_flow - timedelta(days=5)
    period_end = next_flow + timedelta(days=period_length)

    print("\nThe next period start date is:", next_flow.strftime("%A, %B %d, %Y"))
    print("Your ovulation period is:", ovulation_date.strftime("%A, %B %d, %Y"))
    print("Your fertility period is:", fertility_start.strftime("%A, %B %d, %Y"), "to", fertility_end.strftime("%A, %B %d, %Y"))
    print("Your safe period is:", safe_period_start.strftime("%A, %B %d, %Y"), "to", safe_period_end.strftime("%A, %B %d, %Y"))
    print("Your period will last from:", next_flow.strftime("%A, %B %d, %Y"), "to", period_end.strftime("%A, %B %d, %Y"))
    break

customer_Data = [] 
customer_names = []

subtotal = 0

while True:
	name = str(input('Enter your name: '))

	item = str(input('What did the customer buy '))

	qty = int(input('How many pieces '))

	price = int(input("How much per unit "))

	choice = str(input("Add more items? ")) 

	customer_Data.append(f"{item:<18}{qty:<18}{price:<18}{qty * price:<18}")
	customer_names.append(f'{name:<8}')
	
	total = qty * price
	subtotal += total

	if choice == 'no':
		break

vat = subtotal * (17.50 / 100)

customerDiscount = int(input('How much discount did he give you? '))

discount = subtotal * (customerDiscount / 100)
billTotal = (subtotal + vat) - discount 
	
print("SEMICOLON STORES\n");
print("MAIN BRANCH\n");
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n");
print("03293828343\n");
print("DATE: 18-DEC-22 8:48:11 PM\n");
print("CASHIER: SISTER NELSON\n")

#for names in customer_names:
#	print('NAMES: \t', names, end = " ")

print("Name\t" + "\t".join(customer_names))
print('===================================================================================')

print(f"{'ITEM':<18} {'QTY':18} {'PRICE':18} {'TOTAL(NGN)\n'}")

for data in customer_Data:
	print(data + "\n")
print("===================================================================================")

print(f'{'SUBTOTAL':<18}  {subtotal}')
print(f'{'DISCOUNT':<18}  {discount}')
print(f'{'VAT @ 17.5%':<18}  {vat:.2f}')

print("===================================================================================")

print(f'{'BILL TOTAL':<18} {billTotal}')

print("===================================================================================")

print(f"THIS IS NOT A RECEIPT KINDLY PAY  {billTotal}")

print("===================================================================================")


amount_Paid = int(input('How much did he pay? '))
balance = amount_Paid - billTotal


print("SEMICOLON STORES\n");
print("MAIN BRANCH\n");
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n");
print("03293828343\n");
print("DATE: 18-DEC-22 8:48:11 PM\n");
print("CASHIER: SISTER NELSON\n")

print("Name\t" + "\t".join(customer_names))
print('===================================================================================')

print(f"{'ITEM':<18} {'QTY':18} {'PRICE':18} {'TOTAL(NGN)\n'}")

for data in customer_Data:
	print(data + "\n")
print("===================================================================================")

print(f'{'SUBTOTAL':<18}  {subtotal}')
print(f'{'DISCOUNT':<18}  {discount}')
print(f'{'VAT @ 17.5%':<18}  {vat:.2f}')

print("===================================================================================")

print(f'{'BILL TOTAL':<18} {billTotal}')
print(f'{'AMOUNT PAID':<18} {amount_Paid}')
print(f'{'BALANCE':<18} {balance}')

print("===================================================================================")

print(f"THANK YOU FOR YOUR PATRONAGE")

print("===================================================================================")








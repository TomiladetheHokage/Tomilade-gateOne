function creditCardValidator(cardNumber){

let firstDigit = cardNumber.charAt(0);

let lengthOfCard = cardNumber.length

if (firstDigit == '4' && firstDigit == '5' && firstDigit == '6' && lengthOfCard == 16 ){
 return true;
}
else if (length < 16 && length > 16){
 
}return false;
}

let value = creditCardValidator(45555555555555555)

console.log(creditCardValidator(value))

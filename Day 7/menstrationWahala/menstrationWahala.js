const prompt = require('prompt-sync')(); 

while(true) {

let periodStartInput = prompt("When did your last period start? (YYYY-MM-DD) ")

	if (periodStartInput.includes('-') && periodStartInput.length === 10) {

	let periodStartDate = new Date(periodStartInput);

    	console.log("Your last period started on: " + periodStartDate.toDateString());
	break;
		}	
	else {
	console.log("Invalid format. please enter the date in YYYY-MM-DD")
		}

	}

let periodLength = prompt("How long does a period last? ")
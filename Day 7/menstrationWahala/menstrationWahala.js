const prompt = require('prompt-sync')();

while (true) {
    let periodStartInput = prompt("When did your last period start? (YYYY-MM-DD) ");

    let periodStartDate = new Date(periodStartInput);


    if (!isNaN(periodStartDate.getTime())) {
        console.log("Your last period started on: " + periodStartDate.toDateString());
     	break;
   		 } 

	else {
        console.log("Invalid format. Please enter the date in YYYY-MM-DD");
    		}

}


let askUserIfSheKnowsperiodLength = prompt("Do you know how long your period lasts? ")

if (askUserIfSheKnowsperiodLength.toLowerCase() === 'yes'){

let periodLength = prompt("How long does your period last? ")

periodLength = parseInt(periodLength);
console.log(periodLength)
}

if (askUserIfSheKnowsperiodLength.toLowerCase() === 'no'){ 
periodLength = 5
console.log(periodLength)
}


let askUserIfSheKnowsperiodCycle = prompt("Do you know how long your cycle is? ")

if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'yes'){

let cycleLength = prompt("How long does your cycle last? ")

cycleLength = parseInt(cycleLength);

let nextFlow =  new Date(periodStartDate);

nextFlow.setDate(periodStartDate.getDate() + cycleLength);

console.log("The next period start date is: " + nextFlow.toDateString());

}

if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'no'){ 
cycleLength = 28

 nextFlow =  new Date(periodStartDate);

nextFlow.setDate(periodStartDate.getDate() + cycleLength);

console.log("The next period start date is: " + nextFlow.toDateString());

}

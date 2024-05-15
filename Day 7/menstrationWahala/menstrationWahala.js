const prompt = require('prompt-sync')();

let periodStartDate;

while (true) {
    let periodStartInput = prompt("When did your last period start? (YYYY-MM-DD) ");

     periodStartDate = new Date(periodStartInput);


    if (periodStartInput.includes('-') && periodStartInput.length === 10 && !isNaN(periodStartDate.getTime())) {
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

}

if (askUserIfSheKnowsperiodLength.toLowerCase() === 'no'){ 
periodLength = 5

}


let askUserIfSheKnowsperiodCycle = prompt("Do you know how long your cycle is? ")

if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'yes'){

let cycleLength = prompt("How long does your cycle last? ")

cycleLength = parseInt(cycleLength);

 nextFlow =  new Date(periodStartDate);

nextFlow.setDate(periodStartDate.getDate() + cycleLength);

let ovulationBeginDate = new Date(periodStartDate)

ovulationBeginDate.setDate(periodStartDate.getDate() + 12)

let ovulationEndDate = new Date(periodStartDate)

ovulationEndDate.setDate(periodStartDate.getDate() + 16)

console.log("The next period start date is: " + nextFlow.toDateString());
console.log("Your ovulation period is between: " + ovulationBeginDate.toDateString()+ " to"+ ovulationEndDate.toDateString());
}

if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'no'){ 
cycleLength = 28

nextFlow =  new Date(periodStartDate);

nextFlow.setDate(periodStartDate.getDate() + cycleLength);

console.log("The next period start date is: " + nextFlow.toDateString());

}
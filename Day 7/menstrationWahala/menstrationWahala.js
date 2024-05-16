const prompt = require('prompt-sync')();

let periodStartDate;
let periodLength;
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

	periodLength = prompt("How long does your period last? ")

	periodLength = parseInt(periodLength);

		}

	if (askUserIfSheKnowsperiodLength.toLowerCase() === 'no'){ 
	periodLength = 5
			}


while(true){
let askUserIfSheKnowsperiodCycle = prompt("Do you know how long your cycle is? ")

	if (askUserIfSheKnowsperiodCycle !== 'yes' && askUserIfSheKnowsperiodCycle !== 'no'){
	console.log('Please enter yes or no')
		}

	if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'yes'){

	let cycleLength = prompt("How long does your cycle last? ")

	cycleLength = parseInt(cycleLength);

	nextFlow =  new Date(periodStartDate);

	nextFlow.setDate(periodStartDate.getDate() + cycleLength);

	let ovulationDate = new Date(periodStartDate)

	ovulationDate.setDate(periodStartDate.getDate() + 14)

	let fertilityStart = new Date(ovulationDate)

	fertilityStart.setDate(ovulationDate.getDate() - 5)

	let fertilityEnd = new Date(ovulationDate)

	fertilityEnd.setDate(ovulationDate.getDate() + 2)

	let safePeriodStart = new Date(ovulationDate)
	
	safePeriodStart.setDate(ovulationDate.getDate() + 5)

	let safePeriodEnd = new Date(nextFlow)

	safePeriodEnd.setDate(nextFlow.getDate() - 5)

	let periodEnd = new Date(nextFlow)

	periodEnd.setDate(nextFlow.getDate() + periodLength)


	console.log("\nThe next period start date is: " + nextFlow.toDateString());
	console.log("Your ovulation period is: " + ovulationDate.toDateString())
	console.log("Your fertility period is: " + fertilityStart.toDateString()+ " to "+ fertilityEnd.toDateString());
	console.log("Your safe period is: " + safePeriodStart.toDateString()+ " to "+ safePeriodEnd.toDateString());
	console.log("Your period will last from: " + nextFlow.toDateString()+ " to "+ periodEnd.toDateString());
	
	break;
			}


		if (askUserIfSheKnowsperiodCycle.toLowerCase() === 'no'){ 
		cycleLength = 28

		nextFlow =  new Date(periodStartDate);

		nextFlow.setDate(periodStartDate.getDate() + cycleLength);
		
		ovulationDate = new Date(nextFlow)

		ovulationDate.setDate(nextFlow.getDate() - 12)

		fertilityStart = new Date(ovulationDate)

		fertilityStart.setDate(ovulationDate.getDate() - 5)

		fertilityEnd = new Date(ovulationDate)

		fertilityEnd.setDate(ovulationDate.getDate() + 2)

		safePeriodStart = new Date(ovulationDate)
	
		safePeriodStart.setDate(ovulationDate.getDate() + 5)

		safePeriodEnd = new Date(nextFlow)

		safePeriodEnd.setDate(nextFlow.getDate() - 5)

		let periodEnd = new Date(nextFlow)

		periodEnd.setDate(nextFlow.getDate() + periodLength)

		console.log("\nThe next period start date is: " + nextFlow.toDateString());
		console.log("Your ovulation period is: " + ovulationDate.toDateString());
		console.log("Your fertility period is: " + fertilityStart.toDateString()+ " to "+ fertilityEnd.toDateString());
		console.log("Your safe period is: " + safePeriodStart.toDateString()+ " to "+ safePeriodEnd.toDateString());
		console.log("Your period will last from: " + nextFlow.toDateString()+ " to "+ periodEnd.toDateString());

		break;
			}

			}
const prompt = require("prompt-sync")() 


let correctAnswers = 0;
let wrongAnswers = 0;

let randomNumber = 0;
let randomSecondNumber = 0;


for (let counter = 0; counter < 10; counter++){


randomNumber = Math.floor(Math.random() * 10) + 1;
randomSecondNumber =  Math.floor(Math.random() * 17) + 1;

let answer = randomNumber + randomSecondNumber;

let question = parseInt(prompt("What is "+randomNumber+ " + "+ randomSecondNumber+ " ? "));

if (question == answer){
correctAnswers++;
}

else if (question != answer){
wrongAnswers++
}
	}
console.log("You got "+ correctAnswers+ " correctly");
console.log("You got "+ wrongAnswers+ " wrong");




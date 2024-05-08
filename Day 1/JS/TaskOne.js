const prompt = require("prompt-sync")();

let ScoreCounter = 0;
let sumOfScores = 0;

while (ScoreCounter < 10){

let score = Number(prompt("Enter score: "));

sumOfScores += score;

ScoreCounter++;
}

console.log("The sum of scores collected is "+ sumOfScores);

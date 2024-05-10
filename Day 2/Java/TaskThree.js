const prompt = require("prompt-sync")()



let scores  = []

for (let counter = 0; counter < 10; counter++){
let score = Number(prompt("Enter score: "));
scores[counter] = score
}

for(let count = 0; count < 10; counter ++){
console.log(scores[count])
}
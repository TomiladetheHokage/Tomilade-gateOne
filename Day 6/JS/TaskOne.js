function calculateAge(birthDate) {
  
    const [day, month, year] = birthDate.split('/').map(Number);

   
    const currentYear = 2024
    const currentMonth = 5 + 1
    const currentDay = 12

    let age = currentYear - year 
    if (currentMonth < month || (currentMonth === month && currentDay < day)){
	age = age - 1;
		}

    return age;
}


const birthDate = '05/07/2003';
console.log(calculateAge(birthDate))

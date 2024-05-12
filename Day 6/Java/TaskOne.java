public class AgeCalculator {
    public static int calculateAge(String birthDate) {
       
        String[] parts = birthDate.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

       
        int currentYear = 2024;
        int currentMonth = 5;
        int currentDay = 12;


        int age = currentYear - year;
        
      
        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
            age = age -1;
        }

        return age;
    }

   
}

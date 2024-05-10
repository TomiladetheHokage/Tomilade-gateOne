import java.util.Arrays;
public class TaskFive{
public static void main(String[] args){


int numbers [] = {1, 2, 3, 4, 5, 6, 7};

int [] returnedNumbers = TaskFive.oddNumbers(numbers);


System.out.print(Arrays.toString(returnedNumbers)); 
}

public static int [] oddNumbers (int [] numbers){

int [] oddNumbers = new int [3];

int count = 0;

for (int counter = 0; counter < numbers.length - 1; counter++){

if (numbers[counter] % 2 != 0) {

oddNumbers[count] = numbers[counter];

count++;

}
}
return  oddNumbers;
}
}
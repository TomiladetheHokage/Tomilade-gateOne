import java.util.Arrays;
public class TaskFour{
public static void main(String[] args){


int numbers [] = {1, 2, 3, 4, 5, 6, 7};

int [] returnedNumbers = TaskFour.evenNumbers(numbers);


System.out.print(Arrays.toString(returnedNumbers)); 
}
public static int [] evenNumbers (int [] numbers){

int [] evenNumbers = new int [3];

int count = 0;

for (int counter = 0; counter < numbers.length; counter++){

if (numbers[counter] % 2 == 0) {

evenNumbers[count] = numbers[counter];

count++;

}
}
return  evenNumbers;
}
}
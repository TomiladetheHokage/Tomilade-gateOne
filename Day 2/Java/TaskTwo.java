import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int scores [] = new int [10];

for (int counter = 0; counter < 10; counter++){
System.out.print("Enter a score ");
scores[counter] = input.nextInt();
}

for (int count : scores){
System.out.println(count);
}
}
}
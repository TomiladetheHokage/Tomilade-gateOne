import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int counter = 0;

String[] userGamePlay = new String [9];
int[] selectedCells = new int [9];
int[] displayCells = new int [3];

String firstPlayerChoice; 
String secondPlayerChoice; 

while(counter < 9){

System.out.print("X || O \n");
String choice = input.next();


if(!choice.equals("o") && (!choice.equals("x"))){

System.out.print("Enter X OR O nigga \n");
counter --;
}

else{
userGamePlay[counter] = choice;
System.out.print("Which cell do you want to play in \n");
int cell = input.nextInt();

if (cell > 9) {
System.out.print("olodo\n");
counter --;
}
else{
selectedCells[counter ] = cell;
}
}


counter++;

	}

System.out.printf("%10s%10s%10s%n", userGamePlay[0], userGamePlay[1], userGamePlay[2] );
System.out.printf("%10s%10s%10s%n", userGamePlay[3], userGamePlay[4], userGamePlay[5] );
System.out.printf("%10s%10s%10s%n", userGamePlay[6], userGamePlay[7], userGamePlay[8] );
}



		
			}

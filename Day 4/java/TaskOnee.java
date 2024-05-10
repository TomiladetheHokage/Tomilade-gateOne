import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int counter = 0;

String[] userGamePlay = new String [9];
int[] selectedCells = new int [9];



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
selectedCells[counter] = input.nextInt();
}

counter++;

}

for (String i : userGamePlay){
System.out.printf("%10s", i );
}


}	
	
			}

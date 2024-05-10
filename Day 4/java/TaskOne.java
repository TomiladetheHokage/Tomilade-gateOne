import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int counter = 0;

String[] userGamePlay = new String [9];


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

System.out.print("Which cell do you want to play in \n");
int cell = input.nextInt();

if (cell > 9) {
System.out.print("olodo\n");
counter --;
}
else{
userGamePlay[cell - 1] = choice;
}
}


counter++;
}
}


		
			}

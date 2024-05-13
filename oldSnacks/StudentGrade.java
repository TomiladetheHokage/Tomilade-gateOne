import java.util.Scanner;
import java.util.ArrayList;
public class StudentGrade{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


int position = 0;

System.out.print("How many students do you have ");
int studentsNumber = input.nextInt();

System.out.print("How many subjects do they offer ");
int numberOfSubjects = input.nextInt();

System.out.print("Saving >>>>>>>>>>>>>>>>>> \n");
System.out.print("Saving succesfully \n");

int [][]StudentData = new int [studentsNumber] [numberOfSubjects];


	for(int i = 0; i < studentsNumber; i++){

	System.out.println("sub" + (i + 1) + ": ");

	for(int j = 0; j < numberOfSubjects; j++){

	System.out.print("Enter the score: ");
	int scoreOfStudent = input.nextInt();

	if (scoreOfStudent < 1 || scoreOfStudent > 100){
 	System.out.println("Invalid. Enter valid score \n"); 
		j--;		
	}
	else{ 
	StudentData[i][j] = scoreOfStudent;
	
	}
							
}
}

int total[] = new int [studentsNumber];
double [] average = new double [studentsNumber];

System.out.print("\nSTUDENT\t\t");
for(int c = 0; c < numberOfSubjects; c++){
System.out.print("SUB"+(c+1)+ "\t") ;
}

System.out.println("average"+ "\tTOT"+ "\tPOS" );

for (int a = 0; a < studentsNumber; a ++){
System.out.print("\nStudent"+ (a + 1));

	for(int b = 0; b < numberOfSubjects; b++){
	System.out.print("\t"+StudentData[a][b]+ "");
	total[a] += StudentData[a][b];
	average[a] = total[a] / numberOfSubjects;
	
}
	

	System.out.print("\t"+ average[a]+ "\t"+ total[a]+ "\t");
	

	 


}







}
}
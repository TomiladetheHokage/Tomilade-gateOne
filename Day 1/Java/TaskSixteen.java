public class TaskSixteen{
public static void main(String[] args){

int numberFour = 4;
int numberEight = 8;

for (int counter = 1; counter < 1024; counter = counter * 4){

System.out.print(numberFour * counter+ " ");
}

for (int secondCounter = 1; secondCounter < 32768; secondCounter = secondCounter * 8){

System.out.print(numberEight * secondCounter+ " ");
}
}
}

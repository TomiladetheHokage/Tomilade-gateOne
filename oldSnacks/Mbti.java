import java.util.Scanner;
public class Mbti{
public static void main (String[] args){


Scanner input = new Scanner(System.in);



System.out.print("What is your name? ");
String name = input.nextLine();

String[] questions = { "A. Expend energy, enjoy groups,		B. Conserve energy, enjoy one-on-one",
"\nA. Interpret literally,		B. look for meaning and possibilities",
"\nA. Logical, thinking, questioning,	B. empathetic, feeling, accomodating",
"\nA. Organized, orderly,		B. Flexible, adaptable",
"\nA. More outgoing, think out loud, 		B. More reserved, think to yourself",
"\nA. practical, realistic, experimental,	B. Imaginative, innovative, theoretical",
"\nA. Candid, straight forward, frank,		B. Tactful, kind, encouraging",
"\nA. Plan, schedule,		B. Unplanned, spontaneous",
"\nA. Seek many tasks, public activities, interacting with others,		B. Seek private, solidarity activities with quiet to concentrate",
"\nA. Standard, usual, conventinal,		B. Different, novel, unique",
"\nA. Firm, tend to criticize, hold the line,		B. Gentle, tend to appreciate, concilate",
"\nA. Regulated, structured,		B. Easy-going, live, and let live",
"\nA. External, communicative, express yourself,		B. Internal, reticient, keep to yourself",
"\nA. Focus on here-and-now, look to the future,		B. Global perspective, big picture",
"\nA. Tough-minded, just,		B. Tender-hearted, merciful",
"\nA. Preparation, plan ahead,		B. Go with the flow, adapts as you go",
"\nA. Active, initiate,		B. Reflective, deliberate",
"\nA. Facts, things, what is,		B. ideas, dreams, what could be, philosophical",
"\nA. Matter of fact, issue-oriented,		B. Sensitive, people-oriented, compassionate",
"\nA. control, govern,		B. latiutde, freedom",
}; 


String[] options = { "Expend energy, enjoy groups",
"Conserve energy, enjoy one-on-one",
"Interpret literally",
"look for meaning and possibilities",
" Logical, thinking, questioning",
"empathetic, feeling, accomodating",
"Organized, orderly",
"Flexible, adaptable",
"More outgoing, think out loud",
"More reserved, think to yourself",
"practical, realistic, experimental",
"Imaginative, innovative, theoretical",
"Candid, straight forward, frank",
"Tactful, kind, encouraging",
"Plan, schedule",
"Unplanned, spontaneous",
"Seek many tasks, public activities, interacting with others",
"Seek private, solidarity activities with quiet to concentrate",
"Standard, usual, conventinal",
"Different, novel, unique",
"Firm, tend to criticize, hold the line",
"Gentle, tend to appreciate, concilate",
"Regulated, structured",
"Easy-going, live, and let live",
"External, communicative, express yourself",
"Internal, reticient, keep to yourself",
"Focus on here-and-now, look to the future",
"Global perspective, big picture",
"Tough-minded, just",
"Tender-hearted, merciful",
"Preparation, plan ahead",
"Go with the flow, adapts as you go",
"Active, initiate",
"Reflective, deliberate",
"Facts, things, what is",
"ideas, dreams, what could be, philosophical",
"Matter of fact, issue-oriented",
"Sensitive, people-oriented, compassionate",
"control, govern",
"latiutde, freedom",
};


int aCount = 0;
int bCount = 0;

String[] answers = new String [questions.length];

for (int i = 0; i < questions.length ; i++){
System.out.println(questions[i]);
String answeredQuestions = input.nextLine();

if (answeredQuestions.equalsIgnoreCase("a")){
aCount++;
}

else if (answeredQuestions.equalsIgnoreCase("b")){
bCount++;
}



while(!answeredQuestions.equalsIgnoreCase("a") && !answeredQuestions.equalsIgnoreCase("b")){
System.out.println("I know this is an error, please try again");
 answeredQuestions = input.nextLine();

}
if (answeredQuestions.equalsIgnoreCase("b")) {
    answers[i] = options[i * 2 + 1];
} else {
    answers[i] = options[i * 2];
}

}

System.out.print("\nHello "+name+ " you selected:\n");

System.out.println("");

for (int j = 0; j < answers.length; j= j + 4){
System.out.println((1 + j)+ " "+ answers[j]);
}
System.out.print("Number of A selected: "+ aCount+ "\n");
System.out.print("Number of B selected: "+ bCount+ "\n");

System.out.print("\n");

for (int a = 1; a < answers.length; a= a + 4){
System.out.println( (a+1) + " "+ answers[a]);
}
System.out.print("Number of A selected: "+ aCount+ "\n");
System.out.print("Number of B selected: "+ bCount);












}
}
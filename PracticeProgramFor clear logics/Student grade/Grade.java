/*Write a program to accept a mark obtained by a student in
computer science and print the grades accordingly:
Marks Grade
Above 90 A
70 to 89 B
50 to 69 C
below 50 D*/

public class Grade{
	public static void main(String[] args){
	System.out.println("Student is in Computer Science");
	
	int mark=90;
	
	if(mark>=90)
	{
		System.out.println("Students Got a Grade A");
	}
	else if(mark>=70 && mark<90){
		System.out.println("Students Got a Grade B");
	}
	else if(mark>=50 && mark<70){
		System.out.println("Students Got a Grade c");
	}
	else {
		System.out.println("Students Got a Grade D");
	}

}
}
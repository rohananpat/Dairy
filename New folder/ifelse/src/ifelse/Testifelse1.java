package ifelse;

import java.util.Scanner;

public class Testifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter your marks");
		int marks=s.nextInt();
if(marks>35 && marks<=60)
{
	System.out.println("pass class");
}
else if(marks>60 && marks<=80)
{
	System.out.println("First class");
}
else if(marks>80 && marks<=100)
{
	System.out.println("distinction class");
}
else
{
	System.out.println("Fail");
}

	}

}

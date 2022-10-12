package ifelse;

import java.util.Scanner;

public class Testif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter your marks");
int marks=s.nextInt();
if(marks>35 && marks<=60)
{
	System.out.println("pass");
}
else if(marks>60 && marks<=700)
{
	System.out.println("first class");
}
else if(marks>70 && marks<=100)
{
	System.out.println("distinction class");
}
else 
{
	System.out.println("fail");
}
	
	}

}

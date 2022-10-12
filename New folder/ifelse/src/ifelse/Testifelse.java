package ifelse;
import java.util.Scanner;
class Employee{
	
}
public class Testifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("my salary is");
int salary=s.nextInt();
if (salary>0 && salary<=5000)
{
	System.out.println("D band");
}
else if(salary>5001 && salary<=10000)
{
	System.out.println("C band");
}
else if (salary>10001 && salary<=20000)
{
	System.out.println("B band");
}
else
{
	System.out.println("A band");
}
	}

}

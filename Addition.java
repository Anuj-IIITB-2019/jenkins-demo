
import java.util.Scanner;
public class CalAdd{
	public static void main(String args[])
	{
	float a,b,res;
	char choice;
	scanner sc = new Scanner(System.in);
	do{
	System.out.println("1 Add Two numbers");
	System.out.println("2. Exit \n\n");
	System.out.println("Enter your choice");
	choice  = scan.next().charAt(0);
	switch(choice)
		{
		case '1': System.out.println("Enter Two Numbers");
		a=scan.nextFloat();

		b = scan.nextFloat();

		res = a+b;
		System.out.println("Result = "+ res );
		break;
		case '2': System.exit(0);break;

		default: System.out.println("Invalid Choice");
		break;
		}
		System.out.print("\n ---------------------------------------------- \n");
	}
	System.out.print("press y to exit");
	while(ch !='y');

	}
}

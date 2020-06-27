import java.util.Scanner;

public class Program4 {
	
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int num1,num2,a,b,c;
		System.out.println("enter the first number");
		num1=s.nextInt();
		System.out.println("enter the second number");
		num2=s.nextInt();
		if(num1>9 && num2>9)
		{
			a=num1%10;
			b=num2%10;
			
			c=a+b;
					System.out.println("THE SUM OF THE LAST TEO DIGIT IS:"+c);

		}
		else
		{
			System.out.println("NOT ENTER A SINGLE DIGIT ENTER DOUBLE DIGIT");
		}
		
		
	}

}

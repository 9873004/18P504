import java.util.Scanner;

public class Program1 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("you enter the even number");
		}
		else
		{
			System.out.println("you enter the odd number");
		}
	}

}

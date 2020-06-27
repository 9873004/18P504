import java.util.Scanner;

public class Program2 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER");
		
		int number,savenumber;
		number =s.nextInt();
		savenumber=number%10;
		System.out.println("last digit of the given number is:"+savenumber);
	}

}


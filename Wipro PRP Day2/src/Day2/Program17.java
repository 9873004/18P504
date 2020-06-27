package Day2;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			int rem=temp%10;
			temp=temp/10;
			sum=sum*10+rem;
			}
		if(sum==n)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
		}
	}
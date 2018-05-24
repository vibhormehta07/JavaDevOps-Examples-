package MYPACK;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int b=scan.nextInt();
		scan.close();
		for(int i=2; i<=b/2;i++)
		{
			a=b%i;
			if(a==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(b+" is a Prime Number");
		}
		else
		{
			System.out.println(b+" is not a Prime Number");
		}
		}
	}


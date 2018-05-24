package MYPACK;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		a=s.nextLine();
		s.close();
		int x = a.length();
		for(int i=x-1;i>=0;i--)
		{
			b = b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("String is Pallindrome.");
		}
		else
		{
			System.out.println("String is not Pallindrome.");
		}
		
	}

}

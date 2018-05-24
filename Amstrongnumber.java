package MYPACK;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count= 0, x,y,z,sum = 0;
		Scanner a = new Scanner(System.in);
		System.out.print(" Please enter the integeter to check:");
		num = a.nextInt();
		a.close();
		x=num;
		z=num;
		while(x>0)
		{
			x= x/10;
			count++;
		}
		while(num>0) 
		{
			y = num% 10;
			sum =(int)(sum+Math.pow(y, count));
			num =num/10;
		}
		if(sum==z)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		}
	}



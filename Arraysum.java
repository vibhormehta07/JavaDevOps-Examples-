package Mypack;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Array = {5,10,15,20,25};
		int sum = 0;
		for( int count = 0; count<Array.length;count++)
		{
			sum+=Array[count];
			
		}
		System.out.println("SUm of array= "+sum);
	}

}

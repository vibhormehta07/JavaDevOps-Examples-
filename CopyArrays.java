package Mypack;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3};
		int carray[]= new int[array.length];
		for(int i=0; i<array.length;i++)
			carray[i]=array[i];
		
		for(int i = 0; i<carray.length; i++)
			System.out.print(carray[i]);
			
	}

}

package Mypack;


public class comparearrays {
	static void printarray(int[] array)
	{
		for(int i=0; i<array.length;i++)
			System.out.println(array[i]);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] oldarray = {1,2,3};
	int[] newarray = {1,2,3,4,5};
	if(oldarray.length>newarray.length)
	{
		printarray(oldarray);
	
	}
	else
	{
		printarray(newarray);
	}
	}

	
		
	}


	

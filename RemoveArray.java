package Mypack;
import java.util.Arrays;
public class RemoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {0,15,13,17,14};
		System.out.println("Original array: "+Arrays.toString(array1));
		int removeIndex = 1;
		for (int i= removeIndex; i<array1.length-1; i++)
		{
			array1[i] = array1[i+1];
		}
	
	System.out.println("After removing element= "+Arrays.toString(array1));
	}
}

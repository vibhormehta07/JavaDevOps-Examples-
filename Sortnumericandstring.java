package Mypack;
import java.util.Arrays;
public class Sortnumericandstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarray= {24,16,57,9,81};
		String [] array1 = {"Car","JAVA","Python", "apple","ball"};
		System.out.println("Original numeric array: "+Arrays.toString(myarray));
		Arrays.sort(myarray);
		System.out.println("Sorted numeric array: "+Arrays.toString(myarray));
		
		System.out.println("Original string array: "+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted string array: "+Arrays.toString(array1));
		
	}

}
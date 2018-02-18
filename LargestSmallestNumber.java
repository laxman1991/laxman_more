package Basic.OopsConcept.Array;
import java.util.Scanner;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		//largest number in array. 
	
		int number[]= new int[5];
		System.out.println("enter aray elements");  
		Scanner  scanner= new Scanner(System.in);
	 
		 for(int i=0;i<number.length;i++)
		 {
			number[i]=scanner.nextInt(); 
		 }
		System.out.println("disaplaying arrrays");
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
        System.out.println("displaying largest element in as array.");		
	    int largest=0;
	    for(int i=0;i<number.length;i++)
	    {
	    	if(number[i]>largest)
	    	{
	    	   largest=number[i];
	    	}
	    	
	    }
	    System.out.println("largest number is:"+largest);
	 // smallest number in an array.  
	    System.out.println("displaying smallest element is array "); 
        int smallest=number[0];
	    for(int i=0;i<number.length;i++)
	    {
	    	if(number[i]<smallest)
	    	{
	    		smallest=number[i];
	    	}
	    }
		System.out.println("largest number is:"+smallest);
	}
}

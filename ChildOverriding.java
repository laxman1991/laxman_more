package BasicProgram.softedge;

import java.util.Scanner;

public class ChildOverriding extends ParentOverriding{

	public void Cal(int a)
	{
		super.cal(a);
		double area=2*3.14*a;
		System.out.println("area of circle is "+area);
		
	}
	public static void main(String[] args) {
		
		ChildOverriding childOverriding=new ChildOverriding();
		//System.out.println("enter side of square");
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter radius of circle");
		int radius=scanner.nextInt();
		//int side=scanner.nextInt();
		childOverriding.Cal(radius);
		
		

	}

}

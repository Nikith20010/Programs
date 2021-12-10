package nothing;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println(" before swap");
		System.out.println(" first number="+x);
		System.out.println(" second number="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println(" after swap");
		System.out.println(" first number="+x);
		System.out.println(" second number="+y);
		// TODO Auto-generated method stub

	}
}

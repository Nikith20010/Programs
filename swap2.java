package nothing;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		int x,y;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		System.out.println(" before swap");
		System.out.println(" x="+x +"   "+ "y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(" after swap");
		System.out.println(" x="+x +"   "+ "y="+y);
		// TODO Auto-generated method stub

	}

}

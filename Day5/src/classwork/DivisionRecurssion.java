package classwork;

import java.util.*;
public class DivisionRecurssion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = s.nextInt();
		System.out.println( "Number of Digit : " +cnt(num));
		s.close();
	}
	
	public static int cnt(int n)
	{
		if(n/10 == 0) 
			return 1;
//		System.out.println(n);
		return 1 + cnt(n/10);
	}
}

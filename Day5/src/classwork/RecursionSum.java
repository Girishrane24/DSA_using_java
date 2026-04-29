package classwork;

public class RecursionSum {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Sum = " + sum(arr,0));
	}
	// public static datatype functionname(argument)
	public static int sum(int a[] , int i)
	{
		if(i >= a.length)
			return 0;
		
		//System.out.println(a[i]); // print first
		return a[i] + sum(a,i + 1);
	}

}

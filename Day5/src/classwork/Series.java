package classwork;

public class Series {
	public static void main(String[] args) {
		System.out.println("Result : " + rseries(6));
	}
	
	public static int rseries(int n)
	{
		int sum;
		if(n == 0)
		{
			return 0;
		}
		sum = n + rseries(n -1);
		System.out.println(n);
		return sum;
	}

}

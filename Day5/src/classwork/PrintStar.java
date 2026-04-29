package classwork;

public class PrintStar {
	public static void main(String[] args) {
		
		int n = 4;
		printStar(n ,1);
		
	}

	public static void printStar(int n, int i)
	{
		if(i > n)
			return;
		
		System.out.println();
		printPatten(i);
		//System.out.println("* ");
		printStar(n,i + 1);
	}
	public static void printPatten(int i)
	{
		
		//int count = i;
		while(i != 0)
		{
			System.out.print("*");
			i --;
		}
	}
	
}

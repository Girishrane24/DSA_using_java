package day8;

public class HeapSort {

	public static void heapify(int arr[], int n, int i)
	{
		int t,largest = i;
		int left = 2*i + 1;
		int right = 2 * i + 2;
		
		if(left < n && arr[left] > arr[largest])
			largest = left;
		
		if(right < n && arr[right] > arr[largest])
			largest = right;
		
		//if i in not largest then
		if(i != largest)
		{
			t = arr[i];
			arr[i] = arr[largest];
			arr[largest] = t;
			heapify(arr,n,largest);
		}
	}
	
	
	
	public static void HeapSort_(int arr[])
	{
		int n = arr.length;
		int temp;
		for(int i = n/2 -1; i>=0; i--)
		{
			heapify(arr,n,i);
		}
		// heap sort
		//System.out.println(arr[0]);
		
		// swap the element
		for(int i = n-1;i >= 0;i--)
		{
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i , 0);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = 
			{
				48,33,22,3,45,6,4,4,4,3,3,5,554,444	
			};
		HeapSort_(arr);
		
		for(int i = 0; i<arr.length;i++)
			System.out.println(" " + arr[i]);
	
	}
}

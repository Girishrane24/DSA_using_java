package classwork;

public class Recursion {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        display(arr, 0);
    }

    public static void display(int a[], int i) {
        if(i >= a.length) {
            return;
        }

        System.out.println(a[i]); // print first
        display(a, i + 1);
        System.out.println(a[i]);  // print last 
    }
}
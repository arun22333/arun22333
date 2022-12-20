package string;

import java.util.Scanner;

public class ArrayPair1 
{
	public void getpair(int arr[],int sum)
	{
		  int low = 0;
	       int high = arr.length - 1;
	 
	       while(low < high) { 
	 
	          /* 
	            if sum of arr[low] + arr[high] is greater than the 
	            value of sum then decrement the value of high. 
	         */ 
	          if((arr[low] + arr[high]) > sum) {
	                high--;
	 
	          } else if ((arr[low] + arr[high]) < sum) {
	                low++;
	 
	          } else if((arr[low] + arr[high]) == sum) {
	                System.out.println(" Pair (" + arr[low] + " , " + arr[high] + " )");
	                low++;
	                high--;
	          }
	       }
	   }
	
	
public static void main(String[] args)
{
	 ArrayPair1  ob=new  ArrayPair1 ();
	Scanner sc=new Scanner (System.in);
	int arr[]=new int[10];
	System.out.println("enter the array integer");
	for(int i=0;i<=9;i++) 
	{
		arr[i]=sc.nextInt();
		
		}
	System.out.println("enter the input to pair sum");
	int sum=sc.nextInt();
	ob.getpair(arr, sum);
}
}

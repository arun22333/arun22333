package string;

import java.util.Scanner;

public class Tablee_While
{
	public void gettable(int num)
	{
		int i=0;
		while(i<=20)
		{
			System.out.println(num*i);
			i++;
		}
		
	}
public static void main(String[] args)
{
	Tablee_While ob =new Tablee_While();
	Scanner sc =new Scanner (System.in);
	System.out.println("enter the input ");
	int a=sc.nextInt();
	ob.gettable(a);
}
}

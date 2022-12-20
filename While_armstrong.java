package string;

import java.util.Scanner;

public class While_armstrong
{
	public void getArmstrong(int num)
	{
		int tem=num;
		int sum=0;
		while(num>0)
		{
			int a=num%10;
		    num=num/10;
			sum=sum+(a*a*a);
		}
		if (sum==tem)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
public static void main(String[] args) 
{
	 While_armstrong ob=new  While_armstrong();
	 Scanner sc=new Scanner(System.in);
	System.out.println("please enter the input");
	int num=sc.nextInt();
	ob.getArmstrong(num);
	
}
}

package string;

import java.util.Scanner;

public class Throw_demmmo 
{
	public void data (int a)
	{
		try
		{
			if(a<=18)
			{
			 throw new Exception ("age is not valid");
			}
			else
			{
				System.out.println("age is valid");
			}
		}
		catch (Exception e)
		{
			main(null);
		}
		
		
		
	}
public static void main(String[] args) 
{
	Throw_demmmo ob=new Throw_demmmo ();
	Scanner sc =new Scanner (System.in);
	System.out.println("please enter the inpiut");
	int a=sc.nextInt();
	ob.data(a);
}
	
}

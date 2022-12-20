package string;

import java.util.Scanner;

public class Throw_demmmoo 
{
	static int i=0;
	public void getdata(int b)
	{
		try {
			if(b<=18)
			{
				throw new Exception ("not eligble");
			}
			else
			{
				System.out.println("eligble ");
			}
		} catch (Exception e) 
		{
			i++;
			if(i<=2)
			{
				main(null);
			}
			else
			{
				System.out.println("limit exeed");
			}
			//System.out.println(e);
			
		}
	}
public static void main(String[] args) 
{
	 Throw_demmmoo ob=new  Throw_demmmoo();
	 Scanner sc=new Scanner (System.in);
	 System.out.println("please enter the input");
	 int a=sc.nextInt();
	 ob.getdata(a);
}
}

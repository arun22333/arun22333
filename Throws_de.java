package string;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_de
{
	public void getdata() throws InterruptedException, FileNotFoundException
	{
		//FileInputStream fis=new FileInputStream("");
		System.out.println("start");
		Thread.sleep(5000);
		System.out.println("end");
	}
	
public static void main(String[] args) throws FileNotFoundException, InterruptedException 
{
	Throws_de ob=new Throws_de();
	ob.getdata();
}
}

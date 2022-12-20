package string;

public class String_demmmmo
{
public static void main(String[] args) 
{
	String s="arun";
	String s1="arun";
	String s2=new String("arun");
	String s3=new String("arun");
	System.out.println(s==s1);
	System.out.println(s2==s3);
	System.out.println(s==s3);
}
}

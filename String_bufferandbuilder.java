package string;

public class String_bufferandbuilder 
{
public static void main(String[] args)
{
	StringBuffer sb=new StringBuffer();
	StringBuilder sb1=new StringBuilder();
    long starttime=System.currentTimeMillis();
    for(int i=0;i<=1000000;i++)
    {
    sb1.append("hello");
    }
	long endtime=System.currentTimeMillis();
	System.out.println("the builder time is taken  "+(endtime-starttime)+"  millisecond");
	  starttime=System.currentTimeMillis();
	    for(int i=0;i<=1000000;i++)
	    {
	    sb.append("hello");
	    }
		 endtime=System.currentTimeMillis();
System.out.println("the buffer time is taken "+(endtime-starttime)+"  millisecond");
		
}
}

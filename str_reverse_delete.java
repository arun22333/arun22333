package string;
import java.io.*;

public class str_reverse_delete
{
public static void main(String[] args) throws Exception 
{
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the input");
//	String s=sc.next();
//	LinkedHashSet h=new LinkedHashSet();
//	for(int i=0;i<=s.length()-1;i++)
//	{
//		h.add(s.charAt(i));
//		
//	}
//	StringBuffer sb=new StringBuffer();
//	sb.append(h);
//	sb=sb.reverse();
//	String str=sb.toString();
//	str=str.replaceAll("//,/,[[[,]]],..,","");
//	System.out.println(str);
//	
	//a = 97, b = 98...
	//aab
	/*
	 * String[0]
	 * string[1] = 1
	 * 
	 * 
	 * */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("eneter the input");
	int[] string = new int[26];
	String str = br.readLine();
	str = str.toLowerCase();
	String reverse = "";
	for(int i =str.length()-1;i>=0;i--) {
		
		char st = str.charAt(i);
		string[st - 'a']++;
		
		
	}
	for(int i =str.length()-1;i>=0;i--) {
		
		char st = str.charAt(i);
		if(string[st - 'a'] == 1) {
			reverse += st;
		}
	}
	System.out.println(reverse);
	
	
}
}

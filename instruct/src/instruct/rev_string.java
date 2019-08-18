package instruct;
import java.util.*;
public class rev_string {
	
	public static String reverse(String str)
	{
		Stack<Character> stk = new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			stk.push(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while(!stk.empty())
		{
			sb.append(stk.pop());
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string : ");
		str=sc.next();
		str = reverse(str);
		System.out .println("reversed string is : "+str);
	}
}

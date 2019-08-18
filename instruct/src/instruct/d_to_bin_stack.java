package instruct;
import java.util.*;

public class d_to_bin_stack {
	public static void main(String args[])
	{
		System.out.println("enter no : ");
		Scanner scan = new Scanner(System.in);
		int dec = scan.nextInt();
		int n=dec;
		Stack<Integer> stk = new Stack<Integer>();
		while(dec!=0)
		{
			int d = dec%2;
			stk.push(d);
			dec/=2;
		}
		System.out.println("binary equivalent of "+n+" is : ");
		while(!stk.empty())
		{
			System.out.print(stk.pop());
		}
	}
}

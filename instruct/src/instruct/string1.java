package instruct;

import java.util.*;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,com="abc";
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string : ");
		str=sc.next();
		for(int i=0;i<str.length()-2;i++)
		{
			if(str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)=='c')
			{
				System.out.println("element fount at index = "+(i+1));
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Not found");
	}

}

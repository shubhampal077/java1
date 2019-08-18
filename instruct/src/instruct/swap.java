package instruct;

public class swap {
	public static void main(String args[])
	{
		int a=3,b=5;
		System.out.println("before swapping a : "+a+" b : "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.print("after swapping a : "+a+" b : "+b);
	}
}

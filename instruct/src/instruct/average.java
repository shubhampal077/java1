package instruct;
import java.util.Scanner;
public class average {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter first no : ");
		int a = input.nextInt();
		System.out.println("enter second no : ");
		int b = input.nextInt();
		System.out.println("enter third no : ");
		int c = input.nextInt();
		float avg=(float)(a+b+c)/3;
		System.out.println(avg);
	}
}

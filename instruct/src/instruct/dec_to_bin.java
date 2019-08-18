package instruct;
import java.util.Scanner;

public class dec_to_bin {
	static void dectobin(int dec)
	{
		int []arr = new int[1000];
		int i=0;
		while(dec>0)
		{
			arr[i]=dec%2;
			dec/=2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
	}
	public static void main(String args[])
	{
		System.out.print("enter your no : ");
		Scanner input = new Scanner(System.in);
		int dec = input.nextInt();
		dectobin(dec);
	}
}

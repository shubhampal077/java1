package instruct;
import java.util.*;

public class count {
	public static void main(String args[])
	{
		Scanner r = new Scanner(System.in);
	    String ee = r.nextLine();
	    int letter,space,other;
	    letter=space=other=0;
	    for(int i=0;i<ee.length();i++)
	    {
	        if(ee.charAt(i)==32)
	        {
	            space++;
	        }
	       else if( ( ee.charAt(i)>=65 && (int)ee.charAt(i)<=90)|| ((int)ee.charAt(i)>=97&&(int)ee.charAt(i)<=123))
	            letter++;
	        else
	            other++;
	    }
	    System.out.println( letter+" "+ space+" "+other);
	}

}

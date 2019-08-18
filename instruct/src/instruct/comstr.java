package instruct;

public class comstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin plays football";
		String s2="Sachin play football&quot";
		boolean g;
		g=s1.equals(s2);
		if(g)
		System.out.println("Strings are equal");//true
		else
		System.out.println("Strings are not equal");//false

	}

}

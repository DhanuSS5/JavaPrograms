package JavaPlacement;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MALAYALAM";
		String rev="";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;//MALAYALAM
		}
			if(rev.equals(s))
		
		
		{
			System.out.println(rev+" is a palindrome");
		}
			else
			{
				System.out.println(rev+"Not palindrome");
			}

	}

}

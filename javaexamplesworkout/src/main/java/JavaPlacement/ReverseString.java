package JavaPlacement;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hai";
		String rev="";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			//extracts each character
		 ch=s.charAt(i);
		 //add each character in front of existing string
		 rev=ch+rev;
		 
		}
		System.out.println(rev);
		
	
	}

}

package JavaPlacement;

import java.util.Scanner;

public class VowelsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first variable");
		String ch=sc.next();
		switch(ch.toLowerCase())
		{
		case "a","e","i","o","u":System.out.println("The character is a vowel");
		break;
		default:System.out.println("The character is a consonent");
		break;
		}

	}

}

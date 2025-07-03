package javaexample;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    int n = 10, firstTerm = 0, secondTerm = 1;
			    System.out.println("Fibonacci Series till " + n + " terms:");

			    for (int i = 1; i <= n; i++) {
			      System.out.print(firstTerm + ", ");
			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			    }
			  }
			
		

	}



//0,1,1,2,3,5,8
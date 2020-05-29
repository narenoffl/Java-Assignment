public class Assignment3 {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;

		System.out.printf("The sum of %d and %d is %d", a, b, c);

	}

}
Output: javac Assignment3.java
        java Assignment 3 25 25
        The sum of 25 and 25 is 50 

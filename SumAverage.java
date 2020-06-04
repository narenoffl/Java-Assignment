import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements  ");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements ");
		for(int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			sum = sum + a[i];
			
		}
		System.out.println("Sum of the array : " +sum);
		average = (float)sum/n;
		System.out.println("Average = " +average);

	}

}

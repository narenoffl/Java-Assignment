import java.io.*;
public class SumExclude {
	static void sumexcludingrange(int li[], int a, int b) {
		int sum = 0;
		boolean add = true;
		
		for (int i = 0; i < li.length; i++) {
			if(li[i] != a && add == true)
				sum = sum + li[i];
			
			else if(li[i] == a)
				add = false;
			else if(li[i] == b)
				add = true;
		}
		System.out.println("Sum excluding a and b are "+sum);
	}
	public static void main(String[] args) {
		int li[] = {1,2,4,5,6,7,8};
		int a = 1;
		int b = 2;
		
		sumexcludingrange(li, a, b);

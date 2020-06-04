import java.util.*;
public class FreqElement {

	static int mostFrequent(int arr[], int n)
	{
		Arrays.sort(arr);
		int max_count = 1, res = arr[0];
		int curr_count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++ ;
			else
			{
				if (curr_count > max_count)
				{
					max_count = curr_count;
					res = arr[i - 1];
				}
				curr_count = 1;
			}
		}
		if (curr_count > max_count)
		{
			max_count = curr_count;
			res = arr[n - 1];
		}
		return res;
	}
	public static void main (String[] args) {
		int arr[] = { 1,2,3,2,1,5,1,6 };
		int n = arr.length;
		System.out.println("Maximum element is  " +mostFrequent(arr,n));
	}
}

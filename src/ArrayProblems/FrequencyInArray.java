package ArrayProblems;

import java.util.Arrays;

public class FrequencyInArray {
//	Brute Force
	static  void  frequency(int arr[], int n) {
		boolean fr[] = new boolean[n];
		Arrays.fill(fr,false);
		for(int i = 0 ; i<n ; i++) {
			
			if(fr[i]==true) 
				continue;
		
			
			int count = 1;	
			for(int j= i+1; j<n;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=true;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {1,2,2,1,1,8,1};
		int n = arr.length;
		frequency(arr,n);
	}

}

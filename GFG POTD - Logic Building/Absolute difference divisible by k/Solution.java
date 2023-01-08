class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		long ans =0;
		
		long rem[] = new long[k]; // rem=[0 ,0 ,0 ,3 ]
		
		for(int i=0;i<n;i++){
		    rem[arr[i]%k]++;
		}
		for(int i=0;i<k;i++){
		    ans +=((rem[i]-1)*rem[i])/2;
		}
		return ans;
	}
}
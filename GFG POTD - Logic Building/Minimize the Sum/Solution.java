class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        
        long ans =0;
        while(pq.size()!=1){
            int a = pq.poll();
            int b = pq.poll();
            
            int sum = a+b;
            pq.add(sum);
            
            ans+=sum;
        }
        return ans;
    }
}
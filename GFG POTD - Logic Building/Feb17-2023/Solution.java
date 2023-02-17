class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        long sum=0;
        for(long l:GeekNum){
            sum=sum+l;
        }
        for(int curr=K;curr<N;curr++){
            GeekNum.add(sum);
            sum=sum+GeekNum.get(curr)-GeekNum.get(curr-K);//6
        }
        return GeekNum.get(N-1);
    }
}
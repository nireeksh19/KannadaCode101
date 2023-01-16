class Solution{
    public static long[] nextLargerElement(long[] arr, int n) {
        
        Stack<Long> st = new Stack<>();
        
        long[] ans = new long[n];
        
        for(int i=n-1;i>=0;i--){
            
            if(st.isEmpty()) ans[i] = -1;
            
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            
            if(i<n && !st.isEmpty())    ans[i] = st.peek();
            
            else ans[i]=-1;
            
            st.push(arr[i]);
        }
        return ans;
    } 
}
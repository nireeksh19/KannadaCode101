class Solution {
    int solve(int N, int[] A) {
        // code here
        int i;
        for(i=N-1;i>=0;i--){
            if(A[i]<9)
                break;
        }
        return i+1;
    }
};
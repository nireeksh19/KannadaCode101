

class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
        int res=0;
        int j=0;
        StringBuilder sb = new StringBuilder(S);
        for(int i=1; i<N; i++){
            if(sb.charAt(i)!='?' && sb.charAt(i)==sb.charAt(i-1)){
                while(sb.charAt(i)==sb.charAt(i-1)){
                    sb.setCharAt(P[j],'?');
                    j++;
                    res++;
                }
            }
        }
        return res;
    }
}
        
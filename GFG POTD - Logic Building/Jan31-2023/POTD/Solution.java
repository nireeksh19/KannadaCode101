

//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        String c="";
        int count=0;
        while(c.length()<=2*B.length()){
            c+=A;//abcd
            count++;
            if(c.contains(B)){
                return count;
            }
        }
        return -1;
    }
};
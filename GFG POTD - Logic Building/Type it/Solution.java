

// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        int size =s.length();
        int halfsize = size/2;
        int reduce =0;
        while(halfsize>=1){
            String string_1 = s.substring(0,halfsize);
            String string_2 = s.substring(halfsize,halfsize*2);
            if(string_1.equals(string_2)){
                reduce = halfsize-1;
                break;
            }
            halfsize--;
        }
        return size-reduce;
    }
}
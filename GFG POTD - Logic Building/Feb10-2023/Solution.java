

// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        HashMap<Character,Integer> hmap = new HashMap<>();
        hmap.put('b',0);
        hmap.put('a',0);
        hmap.put('l',0);
        hmap.put('o',0);
        hmap.put('n',0);
        
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(hmap.containsKey(ch))
          hmap.put(ch,hmap.get(ch)+1);
        }
        hmap.put('l',hmap.get('l')/2);
        hmap.put('o',hmap.get('o')/2);
        
    int res=Integer.MAX_VALUE;
        for(int e:hmap.values()){
             if(e==0) return 0;
            res=Math.min(res,e);
        }
        return res;
    }
}
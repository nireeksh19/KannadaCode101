//Question - Case specific sorting of string 
//Link : https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        int N = str.length();
        
        char[] upper = new char[N];
        char[] lower = new char[N];
        
        int upperCount=0;
        int lowerCount=0;
        
        for(int i=0;i<N;i++){
            char c =str.charAt(i);
            
            if(Character.isUpperCase(c)){
                upper[upperCount]=c;
                upperCount++;
            }
            else{
                lower[lowerCount]=c;
                lowerCount++;
            }
        }
        
        //sorting
        
        Arrays.sort(upper,0,upperCount);
        Arrays.sort(lower,0,lowerCount);
        
        char[] ans = new char[N];
        int upperIndex=0;
        int lowerIndex=0;
        for(int i=0;i<N;i++){
           char c =str.charAt(i);
           if(Character.isUpperCase(c)){
               ans[i]=upper[upperIndex];
               upperIndex++;
           }
           else{
               ans[i]=lower[lowerIndex];
               lowerIndex++;
           }
        }
        return new String(ans);
    }
}
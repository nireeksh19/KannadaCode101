class Solution {
    public static String longestString(int n, String[] arr) {
        // code here// code here

        String ans="";

        HashSet<String> set=new HashSet<>();

        for(int i=0;i<n;i++)

        {

            set.add(arr[i]);

        }

        

        for(int i=0;i<n;i++)

        {

            boolean flag=true;

            String str=arr[i];

            int len=str.length();

            for(int j=0;j<len;j++)

            {

                String substring=str.substring(0,j+1);

                if(!set.contains(substring))

                {

                    flag=false;

                    break;

                }

            }

            if(flag)

            {

                int strLen=str.length(),ansLen=ans.length();

                if(strLen>ansLen || (strLen==ansLen && (str.compareTo(ans)<0) ) )

                {

                    ans=str;

                }

            }

        } 

        return ans;

 

    }
}
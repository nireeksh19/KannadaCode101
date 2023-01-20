class Solution{
    public int maxWeightCell(int N, int Edge[]){
       int [] arr= new int [N];
       int ans=0;
       int index =0;
       for(int i=0;i<N;i++){
           if(Edge[i]==-1){
               continue;
           }
           arr[Edge[i]]+=i;
           if(arr[Edge[i]]>ans){
               ans = arr[Edge[i]];
               index = Edge[i];
           }
           else if(arr[Edge[i]]==ans && index<Edge[i]){
               index=Edge[i];
           }
       }
       return index;
    }
}
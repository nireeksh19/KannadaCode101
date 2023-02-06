class Solution
{
    long ans;
    Node temp;
    long verticallyDownBST(Node root,int target)
    {
        Node curr=root;
        while(curr!=null){
            if(curr.data==target)
                break;
            else if(curr.data>target){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        if(curr!=null){
            ans=0;
            temp=curr;
            fun(curr,0);
            return ans;
        }
        else{
            return -1;
        }
    }
    void fun(Node root,int val){
        if(root==null) return;
        fun(root.left,val-1);
        fun(root.right,val+1);
        if(root!=temp && val ==0){
            ans=ans+root.data;
        }
    }
    
}
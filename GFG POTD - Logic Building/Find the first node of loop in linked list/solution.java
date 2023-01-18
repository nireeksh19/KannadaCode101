class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        HashSet<Node> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return head.data;
            }
            set.add(head);
            head=head.next;
        }
        return -1;
    }
}
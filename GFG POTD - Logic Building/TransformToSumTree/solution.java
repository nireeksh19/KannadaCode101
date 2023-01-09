class Solution {
    int subTree(Node root) {
        if (root == null)
            return 0;
        int old_value = root.data;
        root.data = subTree(root.left) + subTree(root.right);
        return old_value + root.data;
    }

    public void toSumTree(Node root) {
        // add code here.
        subTree(root);
    }
}
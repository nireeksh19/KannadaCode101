class Solution {
    ArrayList<Integer> maximumValue(Node node) {

        ArrayList<Integer> list = new ArrayList<>();

        if (node == null)
            return list;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int Max = Integer.MIN_VALUE;
            while (size > 0) {
                Node root = queue.remove();
                Max = Math.max(Max, root.data);
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
                size--;
            }
            list.add(Max);
        }
        return list;
    }
}
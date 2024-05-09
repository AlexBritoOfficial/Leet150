
public class MaximumDepthOfBinaryTree104 {

    MaximumDepthOfBinaryTree104(){

    }

    public int maxDepth(TreeNode treeNode) {
        return maxDepthHelper(treeNode, 0);
    }
    public int maxDepthHelper(TreeNode treeNode, int counter) {

        if (treeNode == null) {
            return counter;
        }

        int left = maxDepthHelper(treeNode.left, counter + 1);
        int right = maxDepthHelper(treeNode.right, counter + 1);

        if(left > right){
            return left;
        }

        return right;
    }

    public static void main(String[] args) {

        MaximumDepthOfBinaryTree104 maximumDepthOfBinaryTree104 = new MaximumDepthOfBinaryTree104();

    }

    class TreeNode{
        int element;
        TreeNode left;
        TreeNode right;
        boolean isVisited;
        TreeNode(){

        }
        TreeNode(int element){
            this.element = element;
        }

        public boolean isVisited() {
            return isVisited;
        }

        public void setVisited(boolean visited) {
            isVisited = visited;
        }
    }
}

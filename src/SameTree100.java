public class SameTree100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTreeHelper(p,q);
    }
    public boolean isSameTreeHelper(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        if (p != null && q == null){
            return false;
        }

        if(p == null && q != null){
            return false;
        }

        boolean b1 = true;
        boolean b2 = true;

        if(p.element == q.element){
            b1 =   isSameTree(p.left, q.left);
            b2 =   isSameTree(p.right, q.right);
        }

        else if(p.element != q.element){
            return false;
        }

        if(b1 && b2){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
    }

    class TreeNode{
        int element;
        MaximumDepthOfBinaryTree104.TreeNode left;
        MaximumDepthOfBinaryTree104.TreeNode right;
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

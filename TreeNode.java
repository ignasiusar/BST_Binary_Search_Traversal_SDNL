public class TreeNode{
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data){
        this.data=data;
        this.leftNode = null;
        this.rightNode = null;
    }
    public boolean isLeaf(){
        if (leftNode == null && rightNode == null) {
            return true;
        }else{
            return false;
        }
    }
    public int getData() {
        return this.data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public TreeNode getLeftNode() {
        return this.leftNode;
    }

  
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    
    public TreeNode getRightNode() {
        return this.rightNode;
    }

    
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
    }
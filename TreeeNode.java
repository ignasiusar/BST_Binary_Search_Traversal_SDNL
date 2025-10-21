public class TreeeNode {
    char data;
    TreeeNode leftNode;  
    TreeeNode rightNode;

    public TreeeNode(char data) {  
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }

    public char getData() {        
        return this.data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public TreeeNode getLeftNode() {
        return this.leftNode;
    }

    public void setLeftNode(TreeeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeeNode getRightNode() {
        return this.rightNode;
    }


    public void setRightNode(TreeeNode rightNode) {
        this.rightNode = rightNode;
    }
}
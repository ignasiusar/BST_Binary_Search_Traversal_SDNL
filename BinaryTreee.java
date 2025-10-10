import java.util.Stack;

public class BinaryTreee {
    public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


}
public void addExpressionInfix(String x){
    Stack<TreeNode> operandStack = new Stack <>();
    Stack<TreeeNode> operatorStack = new Stack<>();

for (int i = 0; i < x.length; i++) {
    char c = x.charAt(i);
    if (Character.isLetterOrDigit(c)) {
        operandStack.push(new TreeNode(c));
    }
}}
}

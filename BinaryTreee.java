import java.util.Stack;

public class BinaryTreee {
    private TreeeNode root;

    public BinaryTreee() {
        root = null;
    }

    public BinaryTreee(TreeeNode root) {
        this.root = root;
    }

    public TreeeNode getRoot() {
        return root;
    }

    public void setRoot(TreeeNode root) {
        this.root = root;
    }

    public void addExpressionInfix(String x) {
       
        x = x.replaceAll("\\s+", "");

        Stack<TreeeNode> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (isOperand(c)) {
                operand.push(new TreeeNode(c));
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {
              
                while (operator.peek() != '(') {
                    char opChar = operator.pop();
                    TreeeNode node = new TreeeNode(opChar);
                    node.rightNode = operand.pop();
                    node.leftNode = operand.pop();
                    operand.push(node);
                }
                operator.pop(); 
            } else if (isOperator(c)) {
               
                while (!operator.isEmpty() && operator.peek() != '(' &&
                       precedence(operator.peek()) >= precedence(c)) {
                    char opChar = operator.pop();
                    TreeeNode node = new TreeeNode(opChar);
                    node.rightNode = operand.pop();
                    node.leftNode = operand.pop();
                    operand.push(node);
                }
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            char opChar = operator.pop();
            TreeeNode node = new TreeeNode(opChar);
            node.rightNode = operand.pop();
            node.leftNode = operand.pop();
            operand.push(node);
        }

        
        root = operand.pop();
    }

    private boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }


    public void prefixTraversal() {
        prefixHelper(root);
        System.out.println();
    }

    private void prefixHelper(TreeeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            prefixHelper(node.leftNode);
            prefixHelper(node.rightNode);
        }
    }

    public void postfixTraversal() {
        postfixHelper(root);
        System.out.println();
    }

    private void postfixHelper(TreeeNode node) {
        if (node != null) {
            postfixHelper(node.leftNode);
            postfixHelper(node.rightNode);
            System.out.print(node.getData() + " ");
        }
    }

    public void infixTraversal() {
        infixHelper(root);
        System.out.println();
    }

    private void infixHelper(TreeeNode node) {
        if (node != null) {
            if (!node.isLeaf()) {
                System.out.print("(");
            }
            infixHelper(node.leftNode);
            System.out.print(node.getData());
            infixHelper(node.rightNode);
            if (!node.isLeaf()) {
                System.out.print(")");
            }
        }
    }
}
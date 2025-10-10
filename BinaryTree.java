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

    public void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            TreeNode bantu = root;
            while (true) {
                if (data < bantu.data) {
                    if (bantu.leftNode == null) {
                        bantu.leftNode = new TreeNode(data);
                        return;
                    } else {
                        bantu = bantu.leftNode;
                    }
                } else if (data > bantu.data) {
                    if (bantu.rightNode == null) {
                        bantu.rightNode = new TreeNode(data);
                        return;
                    } else {
                        bantu = bantu.rightNode;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public TreeNode getNode(int data) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (data == bantu.data) {
                return bantu;
            } else {
                if (data < bantu.data) {
                    bantu = bantu.leftNode;
                } else {
                    if (data > bantu.data) {
                        bantu = bantu.rightNode;
                    }
                }
            }
        }
        return null;
    }

    public void InOrderTraversal() {
        InOrderHelper(getRoot());
    }

    public void PostOrderTraversal() {
        PostOrderHelper(getRoot());
    }

    public void PreOrderHelper(TreeNode root) {
        if (root != null) {

            System.out.print(root.getData() + " ");
            PreOrderHelper(root.getLeftNode());
            PreOrderHelper(root.getRightNode());
        }
    }

    public void PreOrderTraversal() {
        PreOrderHelper(getRoot());
    }

    public void InOrderHelper(TreeNode root) {
        if (root != null) {

            InOrderHelper(root.getLeftNode());
            System.out.print(root.getData() + " ");
            InOrderHelper(root.getRightNode());
        }
    }

    public void PostOrderHelper(TreeNode root) {
        if (root != null) {

            PostOrderHelper(root.getLeftNode());
            PostOrderHelper(root.getRightNode());
            System.out.print(root.getData() + " ");
        }
    }

    public TreeNode getParent(int data) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (data == bantu.data) {
                return parent;
            } else {
                if (data < bantu.data) {
                    parent = bantu;
                    bantu = bantu.leftNode;
                } else {
                    parent = bantu;
                    bantu = bantu.rightNode;
                }
            }
        }
        return null;
    }
    public TreeNode getPredecessor(TreeNode x){
    TreeNode bantu = x;
    if(bantu.getLeftNode() == null){
        return null;
    }else{
        bantu = bantu.getLeftNode();
    }
    while(bantu.getRightNode() !=null){
        bantu = bantu.getRightNode();
    }
    return bantu;
}

    public boolean hapus(int key) {
        TreeNode bantu = getNode(key);
        if (bantu == null) {
            return false;
        } else {
            if (bantu.data == root.data) {
                if (bantu.isLeaf() == true) {
                    root = null;

                } else if (bantu.rightNode == null) {
                    root = bantu.leftNode;
                } else if (bantu.leftNode == null) {
                    root = bantu.rightNode;
                } else{
                    TreeNode predesesor = getPredecessor(bantu);
                    TreeNode parentPredesesor = getParent(predesesor.getData());
                    // bantu = getPredecessor(bantu);
                    // parentPredesesor = getParent(getPredecessor.data);
                    bantu.data = predesesor.data;
                if(parentPredesesor != bantu){
                    if (predesesor.leftNode !=null) {
                        parentPredesesor.rightNode = predesesor.getLeftNode();
                    } else{
                    parentPredesesor.rightNode = null;
                    
                    }
                }else{
                    bantu.leftNode = predesesor.leftNode;
                }
            
        }
                return true;
            } else {
                TreeNode parent = getParent(key);
                if (key < parent.data) {
                    if (bantu.isLeaf()== true) {
                        parent.leftNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.leftNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.leftNode = bantu.rightNode;
                    }

                } else {
                    if (bantu.isLeaf()== true) {
                        parent.rightNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.rightNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.rightNode = bantu.rightNode;
                    }
                    else{
                         TreeNode predesesor = getPredecessor(bantu);
                    TreeNode parentPredesesor = getParent(predesesor.getData());
                        bantu.data = predesesor.data;
                        if(parentPredesesor != bantu){
                             if (predesesor.leftNode !=null) {
                        parentPredesesor.rightNode = predesesor.getLeftNode();
                    if(parentPredesesor != bantu){
                    if (predesesor.leftNode !=null) {
                        parentPredesesor.rightNode = predesesor.getLeftNode();
                    } else{
                    parentPredesesor.rightNode = null;
                    
                    }
                }else{
                    bantu.leftNode = predesesor.leftNode;
                }
                

                return true;
            }
        }
    }

    }
}
    }
        return false;
    }
}


// Setter untuk root
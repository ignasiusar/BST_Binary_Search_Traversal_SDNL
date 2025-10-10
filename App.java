import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Membuat objek BinaryTree
        BinaryTree myTree = new BinaryTree();
        myTree.add(42);
        myTree.add(21);
        myTree.add(38);
        myTree.add(27);
        myTree.add(71);
        myTree.add(82);
        myTree.add(55);
        myTree.add(63);
        myTree.add(6);
        myTree.add(2);
        myTree.add(40);
        myTree.add(12);

    
          System.out.println("==================================");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int angka = input.nextInt();

        if (myTree.getNode(angka) != null) {
            System.out.println(">> " + angka + " Ditemukan!");
        } else {
            System.out.println(">> Tidak Ditemukan!");
        }

        System.out.println("\n==================================");
        System.out.println("Traversal Tree:");
        System.out.print("Pre Order  : ");
        myTree.PreOrderTraversal();
        System.out.print("\nIn Order   : ");
        myTree.InOrderTraversal();
        System.out.print("\nPost Order : ");
        myTree.PostOrderTraversal();

        System.out.println("\n\n==================================");
        System.out.print("Masukkan data untuk mencari parent: ");
        int parent = input.nextInt();
        TreeNode cariParent = myTree.getParent(parent);

        if (cariParent != null) {
            System.out.println(">> Parent dari " + parent + " adalah " + cariParent.data);
        } else {
            System.out.println(">> Data tidak ditemukan!");
        }

        System.out.println("\n==================================");
        System.out.print("Masukkan data yang ingin dihapus: ");
        int hapus = input.nextInt();
        myTree.hapus(hapus);

        System.out.println("\n>> Setelah Hapus " + hapus + ":");
        System.out.print("Pre Order  : ");
        myTree.PreOrderTraversal();
        System.out.print("\nIn Order   : ");
        myTree.InOrderTraversal();
        System.out.print("\nPost Order : ");
        myTree.PostOrderTraversal();

        System.out.println("\n==================================");
    
}
}
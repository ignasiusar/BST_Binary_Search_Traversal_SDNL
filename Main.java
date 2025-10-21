import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ekspresi infix: ");
        String expression = scanner.nextLine().trim();

      
        if (expression.isEmpty()) {
            System.out.println("Ekspresi tidak boleh kosong!");
            scanner.close();
            return;
        }

      
        BinaryTreee tree = new BinaryTreee();
        tree.addExpressionInfix(expression);

       
        System.out.println("\nEkspresi Infix: " + expression);
        System.out.print("Prefix (Pre-order): ");
        tree.prefixTraversal();

        System.out.print("Infix: ");
        tree.infixTraversal();

        System.out.print("Postfix (Post-order): ");
        tree.postfixTraversal();

    }
}
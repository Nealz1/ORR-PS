import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] A = new int[2][2];
            int[][] B = new int[2][2];

            System.out.println("Enter matrix A (2x2):");
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    A[i][j] = scanner.nextInt();
                }

            System.out.println("Enter matrix B (2x2):");
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) {
                    System.out.print("B[" + i + "][" + j + "]: ");
                    B[i][j] = scanner.nextInt();
                }

            int[][] result = Server.multiply(A, B);

            System.out.println("Result (A x B):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}

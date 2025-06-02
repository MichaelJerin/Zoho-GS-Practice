import java.util.Arrays;

public class Question_27 {
    public static void main(String[] args) {
        int[][] n = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] mad = new int[n.length][n.length];

        for (int i = 0; i < n.length; i++) {
            for (int j = n.length-1; j >=0; j--) {
                mad[i][n.length - 1 - j] = n[j][i];
            }
            System.out.println();
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(mad[i][j]);
            }
            System.out.println( );
        }
    }
}
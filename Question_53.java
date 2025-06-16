public class Question_53 {
    public static void main(String[] args) {
        int n = 10;
        triangle(n);
    }

    public static void triangle(int n) {
        int rows = 0;
        int total = 0;

        while (total < n) {
            rows++;
            total = total + rows;
        }

        if (total != n) {
            System.out.println("Input doesn't make a perfect pyramid");
        } else {
            int num = 1;
            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }
    }
}

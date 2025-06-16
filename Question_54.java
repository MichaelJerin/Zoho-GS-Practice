public class Question_54 {
    public static void main(String[] args) {
        int n = 5;
        x(n);
    }
    public static void x(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || j == n - i - 1){
                    System.out.print(j+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

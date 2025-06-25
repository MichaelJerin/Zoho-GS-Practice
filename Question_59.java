public class Question_59 {
    public static void main(String[] args) {

        int boxes = 2;
        int rows = 3;

        for(int  i = 0; i < rows; i++) {
            for(int j = 0; j < boxes; j++) {
                System.out.print("+===");
            }
            System.out.println("+");

            if(i == rows - 1) {
                break;
            }

            for(int k = 0; k < rows; k++) {
                for(int j = 0; j < boxes; j++) {
                    System.out.print("| ");
                }
                System.out.println("|");
            }
        }
    }
}

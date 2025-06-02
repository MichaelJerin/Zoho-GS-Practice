public class Question_36 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,4,5,6,7,8};

        System.out.println("Frequency: ");

        for (int i = 0; i < arr.length; i++) {
            boolean counted = false;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;

                    if(i > j){
                        counted = true;
                        break;
                    }
                }
            }
            if(!(counted)){
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
    }
}

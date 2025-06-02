public class Question_26 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        merge(arr1, arr2);

    }
    public static void merge(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }
        System.out.println("Merged Array: ");
        for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
        }
        System.out.println();

        System.out.println("Repeated Elements: ");
        for (int i = 0; i < merged.length; i++) {
            for (int j = i+1; j < merged.length; j++) {
                if(merged[i] == merged[j]){
                    System.out.print(merged[i] + " ");
                }
            }
        }
    }
}

import java.util.ArrayList;

public class Question_57 {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char[] arr2 = {'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i'};
        System.out.println(duplicate(arr1, arr2));
    }

    public static char[] duplicate(char[] arr1, char[] arr2) {
        ArrayList<Character> how = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[j]){
                    how.add(arr1[i]);
                    how.add(arr2[j]);
                }
            j++;
        }
        int z = how.size();
        char[] arr = new char[z];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = how.get(i);
        }
        return arr;
    }
}

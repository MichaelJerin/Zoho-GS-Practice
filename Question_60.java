public class Question_60 {
    public static void main(String[] args) {
        String [][] arr = {
                {"W","E","L","C","O"},
                {"M","E","T","0","Z"},
                {"O","H","O","C","O"},
                {"R","P","O","R","A"},
                {"T","I","O","N"}
        };
        String find = "TOO";
        check(arr,find);
    }
    private static void check(String[][] arr,String find){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = 0; j < arr[i].length - 2; j++){
                sb.append(arr[i][j]);
                sb.append(arr[i][j + 1]);
                sb.append(arr[i][j + 2]);
                if(sb.toString().equals(find)){
                    System.out.println("Starting Index <" + i + ", " + j +">");
                    System.out.println("Ending Index <" + i + ", " + (j + 2) + ">");
                }else{
                    sb.setLength(0);
                }
                sb.append(arr[i][j]);
                sb.append(arr[i + 1][j]);
                sb.append(arr[i + 2][j]);
                if(sb.toString().equals(find)){
                    System.out.println("Starting Index <" + i + ", " + j + ">");
                    System.out.println("Ending Index <"+ (i + 2) + ", " + j + ">");
                }else{
                    sb.setLength(0);
                }
            }
        }
    }
}

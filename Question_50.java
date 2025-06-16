    import java.util.Scanner;

    public class Question_50 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if(n < 0 || n > 999){
                System.out.println("Enter valid numbers");
            }
            else {

                int digit = n % 10;
                int ten = (n/10) % 10;
                int hun = n / 100;

                String[] once = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
                        " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

                String[] tens = {"", "ten", " twenty ", " thirty ", " forty ", " fifty ", " sixty ", "seventy", "eighty", " ninety " };

                String result = "";
                if (n == 0){
                    result = "Zero";
                }
                else if (n < 20){
                    result += once[n];
                }
                else if (n < 100){
                    result += tens[ten] + (digit != 0 ? " "+ once[digit] : "" );
                }
                else {
                    result = once[hun] + " hundred";
                    int remainder = n % 100;

                    if(remainder != 0){
                        if(remainder < 20) {
                            result += once[remainder];
                        }
                        else {
                            result += tens[ten];
                            if (digit != 0) {
                                result += once[digit];
                            }
                        }
                    }
                }
                System.out.println(result);
            }
        }
    }

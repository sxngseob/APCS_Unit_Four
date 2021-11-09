public class ForLoops {

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {

        String a = "";

        for(int i = 0; i < num; i++){
                a += "#";
        }
        return a;
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {

        String numResult = "";
        int number1 = num1;
        int number2 = num2;

        if (num1 > num2){
            for (int i = 0; i <= Math.abs(num1) + Math.abs(num2); i++){
                numResult += number1 + " ";
                number1--;
            }
        }

        if (num2 > num1) {
            for (int i = 0; i <= num2 - num1; i++) {
                numResult += number2 + " ";
                number2--;
            }
        }

        return numResult;
    }

    public static int sumNumbers(int num1, int num2){

        return 1;
    }

}

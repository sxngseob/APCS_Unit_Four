import java.util.Scanner;

public class Disemvoweling {

        public static String disemvowelDouble(String s){
            String result = "";
            boolean didRemove = false;
            for (int i = 0; i < s.length() - 1; i++){
                String a = s.substring(i, i + 1);
                String b = s.substring(i + 1, i + 2);

                if (a.equals(b)) {
                    didRemove = true;
                } else {
                    result += s.substring(i, i + 1);
                }
            }
            result += s.substring(s.length()-1);
            return result;
        }

        public static String disemvowel(String s){

            String vowel = "aeiouAEIOU";
            String result = "";

            for(int i = 0; i <= s.length()-1; i++){
                if(vowel.contains(s.substring(i , i + 1))){
                    result += "";
                } else {
                    result += s.substring(i, i + 1);
                }
            }
            return result;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the disemvoweling utility.");
            System.out.print("Enter your phrase: ");
            String userInput = scan.nextLine();
            System.out.print("The disemvoweled phrase is: ");
            //disemvowel method
            String s = disemvowelDouble(userInput);
            String a = disemvowel(s);
            String result = disemvowelDouble(a);
            System.out.println(result);

            double c = userInput.length();
            double d = result.length();

            int e = (int) c;
            int f = (int) d;

            double percent = 1 - (d / c); //ex. 0.31112
            int percent1 = (int) (percent * 1000); //ex. 311.112 -> 311
            double resultPercent = ((double) percent1) / 10.0;

            System.out.println("Reduced from " + e + " to " + f + " characters.  Reduction rate of " + resultPercent + "%");


        }


}


public class NestedLoops {

    public static String xSquare(int n) {
        String squareX = "";
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                squareX += "X";
            }
            squareX += "\n";
        }
        return squareX;
    }

    public static String flippedTriangle(int n) {
        String triangle = "";
        for(int i = 0; i <= n; i++){
            for(int j = 6; j >= i; j--){
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String fizzBuzz(int n) {
        String fizzBuzzReturn = "";
        for(int i = 1; i <= n; i++){
            if (i % 15 == 0){
                fizzBuzzReturn += "FizzBuzz ";
            } else if (i % 3 == 0 && i % 15 != 0){
                fizzBuzzReturn += "Fizz ";
            } else if (i % 5 == 0 && i % 15 != 0){
                fizzBuzzReturn += "Buzz ";
            } else {
                fizzBuzzReturn += i + " ";
            }
            if(i % 20 == 0){
                fizzBuzzReturn += "\n";
            }
        }
        return fizzBuzzReturn;
    }
}

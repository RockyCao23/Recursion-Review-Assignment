import java.sql.SQLOutput;

public class Euclids {


    public static int Euclid(int x, int y){


        if (x == y){ //base case
            return x;
        }
        else if (x > y){
            x = x - y;
        }
        else if (y > x){
            y = y - x;
        }

        return Euclid(x,y);
    }

    public static String reverseTriangle(int n){

        String y = "";

        if (n == 0){
            return "";
        }
        String x = reverseTriangle(n-1);

        y = x + "*";
        System.out.println(y);


        return y;


    }
    public static void printStars(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static String triangle(int n){
        int z = n+1;
        printStars(z-1);
        String x = "";
        if (n == 0){
            return "";
        }

        return triangle(n-1);
    }

    public static String reverse(String word){
        int l = word.length();
        if (word.length() <= 0){
            return word;
        }

        String x = word.substring(l-1,l);
        word = word.substring(0,l-1);

        return x + reverse(word);
    }
    public static boolean isPalindrome(String word){
        String x = "";
        String y = "";
        int l = word.length();
        if (word.length() <= 2){
            return true;
        }
        x = word.substring(0,1);
        y = word.substring(l-1,l);
        if (x.equals(y)){
            word = word.substring(1,l-1);
            isPalindrome(word);
        }else return false;

        /*x = word.toUpperCase();       //reversing
        if (reverse(x).equals(x)){
            return true;
        }else return false;
        */
        return true;
    }


    public static void main(String[] args) {

        System.out.println(Euclid(252, 105));
        reverseTriangle(5);
        System.out.println(triangle(5));
        System.out.println(reverse("bob the builder"));

    }
}

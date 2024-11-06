import java.util.Scanner;

public class ABC367_B_end_with {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        while (X.endsWith("0")) {
            X = X.substring(0,X.length()-1);
        }
        if (X.endsWith(".")) {
            X = X.substring(0,X.length()-1);
        }
        System.out.println(X);
    }
}

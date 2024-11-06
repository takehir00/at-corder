import java.util.Arrays;
import java.util.Scanner;

public class ABC357_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long upperCaseCount = Arrays
                .stream(S.split(""))
                .filter(s -> Character.isUpperCase(s.toCharArray()[0]))
                .count();

        if (upperCaseCount > S.length() - upperCaseCount) {
            System.out.println(S.toUpperCase());
        } else {
            System.out.println(S.toLowerCase());
        }
    }
}

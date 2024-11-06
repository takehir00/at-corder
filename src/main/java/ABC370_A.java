import java.util.Scanner;

public class ABC370_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        if ((l == 1 && r == 1) || (l == 0 && r== 0)) {
            System.out.println("Invalid");
        } else if (l==1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

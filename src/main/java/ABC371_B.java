import java.util.*;

public class ABC371_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // 列数 列数分ループ回す
        Set<Integer> taroHomeNumberSet = new HashSet<>();

        for (int i = 0;i < M;i++) {
            int homeNumber = sc.nextInt();
            String sex = sc.next();
            if (sex.equals("M") && taroHomeNumberSet.add(homeNumber)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


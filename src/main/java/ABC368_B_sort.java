import java.util.*;

public class ABC368_B_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 列数
        int N = sc.nextInt();
        // 数列を受け取る
        Integer[] numbers = new Integer[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int execCount = 0;
        // 0より大きい要素が１個以下になったら処理を終わりたい
        // 0より大きい要素が１個より多い間は処理を続ける
        while (Arrays.stream(numbers).filter(num -> num > 0).count() > 1L) {
            Arrays.sort(numbers,Comparator.reverseOrder());
            // 先頭の２つから１減算する
            numbers[0] = numbers[0] - 1;
            numbers[1] = numbers[1] - 1;
            execCount++;
        }

        // 操作した回数を出力する
        System.out.println(execCount);
    }
}

/**
 *   Comparator使った書き方
 *   List<Integer> numList = new ArrayList<>();
 *         for (int i = 0; i < N; i++) {
 *             numList.add(sc.nextInt());
 *         }
 *   numList.sort(Comparator.comparingInt((n) -> (int) n).reversed());
 */
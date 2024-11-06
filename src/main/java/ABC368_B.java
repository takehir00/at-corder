import java.util.*;

public class ABC368_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] numberList = new Integer[N];
        for (int i = 0; i < N;i++) {
            numberList[i] = sc.nextInt();
        }
        int execCount = 0;
        // 正の個数が１つ以下　-> １番目の要素が１より小さかったら処理を終了する
        while (numberList[1] > 0) {
            // 降順に並び替える
            Arrays.sort(numberList,Comparator.reverseOrder());
            // ０番目と１番目の要素を-1する
            numberList[0] -= 1;
            numberList[1] -= 1;
            execCount++;
        }
        System.out.println(execCount);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC359_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 色が1〜N色ある
        // 人数は2N人いる
        // 同じ色をきている人は必ず２人いる
        // 同じ色の間に１人だけ人がいるケースが何通りあるかを出力する
        int N = sc.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 2*N; i++) {
            integerList.add(sc.nextInt());
        }
        // 最後から２番目の要素を検査したらループを終了する
        int matchCount = 0;
        for (int i = 0; i < integerList.size()-2; i++) {
            // 2個先の要素が自身と等しいかどうかを走査していく
            if (integerList.get(i).equals(integerList.get(i+2))) {
                matchCount++;
            }
        }
        System.out.println(matchCount);
    }
}

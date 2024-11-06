import java.util.*;
import java.util.stream.Collectors;

public class ABC363_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 人数
        int N = sc.nextInt();
        // 長さの閾値
        int T = sc.nextInt();
        // 長さの閾値を超えた人数の閾値
        int P = sc.nextInt();
        // 最初の長さのリスト
        List<Integer> lengthList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lengthList.add(sc.nextInt());
        }

        // 全員のLを1日ごとに+1する
        // 1ループごとにLのリストのT以上の人数をカウントしてP人以上かどうかを計算する
        int days = 0;
        while (lengthList.stream().filter(length -> length >= T).count() < P) {
            // 全要素を１カウントアップする
            for (int i = 0; i < N; i++) {
                lengthList.set(i,lengthList.get(i)+1);
            }
            days++;
        }
        System.out.println(days);
    }
}

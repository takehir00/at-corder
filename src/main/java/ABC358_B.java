import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC358_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // チケットを買いに来る人数
        int N = sc.nextInt();
        // チケットを買うのにかかる秒数
        int A = sc.nextInt();
        // Tは雷行者がそれぞれ今から何秒後にチケット売り場の列にくるのかのリスト
        List<Integer> timeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            timeList.add(sc.nextInt());
        }
        // 累積の時間の合計
        int totalTime = 0;
        // 3人が それぞれ4秒かけてチケットを買う
        // １人目は0秒後 2人目は2秒後 3人目は10秒後にくる
        //
        for (int i = 0; i < N; i++) {
            // T秒がtotalより小さかったら Nを加算 total=3 t=3 のときは?
            Integer time = timeList.get(i);
            if (totalTime >= time) {
                totalTime += A;
                System.out.println(totalTime);
            } else {
                totalTime += A+time-totalTime;
                System.out.println(totalTime);
            }
        }
     }
}

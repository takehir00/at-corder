import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_370B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 列数
        int N = sc.nextInt();

        // i,jの対応表を作る
        List<List<Integer>> alchemyTable = new ArrayList<>();
        for (int i = 0;i < N;i++) {
            List<Integer> alchemyLine = new ArrayList<>();
            for (int j = 0;j < i+1; j++) {
                alchemyLine.add(sc.nextInt());
            }
            alchemyTable.add(alchemyLine);
        }

        // N回ループ で 元の元素（合成元）を変化させる
        Integer targetAlchemy = 1;
        // 合成相手はループでカウントアップしていく
        for (int i = 1;i < N+1;i++) {
            // iが合成相手の数字
            // startAlchemyとiを比較して、大小関係に応じて適切な座標の合成値を取得する
            // その値をstartAlchemyに代入する　ていう処理を繰り返す
            if (targetAlchemy >= i) {
               targetAlchemy = alchemyTable.get(targetAlchemy).get(i);
            } else {
                targetAlchemy = alchemyTable.get(i).get(targetAlchemy);
            }
        }
    }
}

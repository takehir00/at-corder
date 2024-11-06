import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 食べた食品数
        int N = sc.nextInt();
        // 栄養素の種類
        int M = sc.nextInt();
        // 各栄養素ごとのとらなければいけない量
        List<Integer> requiredNutrition = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            requiredNutrition.add(sc.nextInt());
        }
        // 摂取したiごとの栄養素の合計値
        List<Integer> totalNutrition = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0) {
                    totalNutrition.add(sc.nextInt());
                } else {
                    // i=２週目以降はリストの要素を取得して加算
                    totalNutrition.set(j,totalNutrition.get(j) + sc.nextInt());
                }
            }
        }

        List<Boolean> checkFlagList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if (totalNutrition.get(i) < requiredNutrition.get(i) ) {
                checkFlagList.add(false);
            } else {
                checkFlagList.add(true);
            }
        }

        if (checkFlagList.contains(false)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class A372_B {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        // 非負整数列には0から10の任意の数が最大20個入ってる
        // M = 100
        // N = 4
        // ex (2,0,2,4)
        // iのindexに該当する非負整数列の整数が３の乗数になる
        // 3*3（２乗） + 3の0乗=1 + 3*3（２乗） + 3*3*3*3（４乗） = 19 + 81 = 100
        // 3の０乗から10乗の数字をあらかじめ作っておく、対数をindexとして連想配列にする
        // Mより小さい値の最大値を減算して0になるまで続けたら良さそうな。

        List<Integer> nonNegativeNumberList = new ArrayList<>();
        Map<Integer,Double> powMap = new HashMap<>();
        for (int i = 0; i < 11;i++) {
            powMap.put(i,Math.pow(3, i+0.0));
        }

        for (int i = 0; i < 11;i++) {
            while(M > 0) {
                M -= powMap.get(10-i).intValue();
                if (M >= 0) {
                    nonNegativeNumberList.add(10-i);
                }
            }
            if (M == 0) {
                break;
            }
            // M < 0 になったらMを減算前に戻して次のループ
            M += powMap.get(10-i).intValue();
        }

        System.out.println(nonNegativeNumberList.size());
        System.out.println(nonNegativeNumberList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
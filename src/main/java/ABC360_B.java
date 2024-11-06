import java.util.*;
import java.util.stream.Collectors;

public class ABC360_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        // Sの文字数-1した数を降順に見て行く。カウントダウンする度に文字の分割処理をする
        // s=atcorder
        List<List<String>> divideStringListOfAllPattern = new ArrayList<>();
        for (int i = S.length()-1; i > 0; i--) {
            // 文字数/区切る数の分ループして区切る。
            List<String> divideStringList = new ArrayList<>();
            for (int j = 0; j < S.length() / i; j++) {
                // atcorderのatcor まで　取得したい startWithは0始まり　endwithは1始まり
                divideStringList.add(S.substring(j*i,j*i+j));
            }
            // ループ終わったら最後の剰余の分だけ文字抜き出す
            if (S.length()%i != 0) {
                divideStringList.add(S.substring(S.length()-S.length()%i));
            }
            divideStringListOfAllPattern.add(divideStringList);
        }
        // 要素数がTの文字数と同じ要素を抜き出す。各要素の末尾を順番に連結する
        List<String> targetList =
                divideStringListOfAllPattern.stream()
                        .filter(list -> list.size()==T.length())
                        .map(
                                list-> list.stream()
                                        .map(ele ->  String.valueOf(ele.charAt(T.length()-1)))
                                        .collect(Collectors.joining(""))
                        ).collect(Collectors.toList());
        // Tと等しかったらYes
        if (targetList.contains(T)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

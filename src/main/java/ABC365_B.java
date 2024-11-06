import java.util.*;
import java.util.stream.Collectors;

public class ABC365_B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            // 各要素をindexとのペアで連想配列にする
            Map<Integer,Integer> numWithIndex = new HashMap<>();
            for (int i = 0; i < N; i++) {
                numWithIndex.put(i,sc.nextInt());
            }
            // ソートする
            List<Map.Entry<Integer, Integer>> orderedNumWithIndex =
                    numWithIndex.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
            // 降順に並べ替える
            Collections.reverse(orderedNumWithIndex);
            // ２番目に大きい要素のindexをとる
            System.out.println(orderedNumWithIndex.get(1).getKey()+1);

        }
}

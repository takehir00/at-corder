import java.util.*;
import java.util.stream.Collectors;

public class ABC366_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の要素数
        int N = sc.nextInt();
        List<String> S_List = new ArrayList<>();
        for (int i = 0;i < N;i++) {
            S_List.add(sc.next());
        }
        // わかんないけどリストを反転させてそう
        Collections.reverse(S_List);
        // 最大文字数
        int M = S_List.stream().max(Comparator.comparingInt(String::length)).get().length();

        // verticalArrayの要素数を inputStringArrayのもつlineの文字数の最大値分作る
        List<List<String>> T_List = new ArrayList<>();
        for (int i = 0; i < S_List.size();i++) {
            String S = S_List.get(i);
            // 最大文字数の分ループする、最大文字数より少ない文字数の場合jがなくてindexOutしちゃうのでblank入れる
            for (int j = 0; j < M; j++) {
                // 最初のStringの時だけlistをnewして、それ以降はverticalArrayからindex指定で取得する
                if (i==0) {
                    List<String> 横列 = new ArrayList<>();
                    if (S.length() <= j) {
                        横列.add(" ");
                    } else {
                        横列.add(String.valueOf(S.charAt(j)));
                    }
                    T_List.add(j,横列);
                } else if (S.length() <= j) {
                    T_List.get(j).add(" ");
                } else {
                    T_List.get(j).add(String.valueOf(S.charAt(j)));
                }
            }
        }

        // T_Listの各要素を走査して、末尾以外のblankを*に変換する
        // 変換するケース
        // a * * t  * b *  t
        // 変換しないケース
        // a b c 空
        // a 空 空 空 空
        T_List.stream().map((sList) -> {
            for (int i = sList.size()-1; i >= 0;i--) {
                // 末尾は空でもそうでなくても*に変換しない
                if (i==sList.size()-1) continue;
                // 一つ先のindex=文字列　かつ 現在が空の場合にのみ変換する
                if (!sList.get(i+1).equals(" ") && sList.get(i).equals(" ")) sList.set(i,"*");
            }
            return sList;
        }).forEach((t_list -> System.out.println(String.join("", t_list))));

//        for (List<String> array : T_List) {
//            System.out.println(String.join("", array));
//        }

    }
}

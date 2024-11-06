import java.util.*;

public class ABC364_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 行数
        int H = sc.nextInt();
        // 列数
        int W = sc.nextInt();
        // 現在地i
        int si = sc.nextInt()-1;
        // 現在地j
        int sj = sc.nextInt()-1;
        // グリッドを作る
        List<List<String>> grid = new ArrayList<>(); // 初めの要素が1列目になる
        for (int i = 0; i < H; i++) {
            // 文字列にblankがないから１文字として取る
            String s = sc.next();
            List<String> line = new ArrayList<>();
            for (int j = 0; j < W; j++) {
                line.add(String.valueOf(s.charAt(j)));
            }
            grid.add(line);
        }
        // LRUDからなる文字列
        String X = sc.next();
        // Xの文字列の回数分だけ移動の処理を行う
        for (int i = 0; i < X.length(); i++) {
            String task = String.valueOf(X.charAt(i));
            if (task.equals("L")) {
                if (sj==0) {
                    continue;
                }
                // 現在いるマスの１つ左のマスが存在し、かつ、そのマスが「.」なら
                if (!grid.get(si).get(sj-1).isEmpty() && grid.get(si).get(sj-1).equals(".")) {
                    // 左のマスに移動する
                    sj -= 1;
                }
            } else if (task.equals("R")) {
                if (sj==W-1) {
                    continue;
                }
                // 現在いるマスの１つ右のマスが存在し、かつ、そのマスが「.」なら
                if (!grid.get(si).get(sj+1).isEmpty() && grid.get(si).get(sj+1).equals(".")) {
                    // 右のマスに移動する
                    sj += 1;
                }
            } else if (task.equals("U")) {
                // grid.get(si-1).get(sj)でぬるぽで落ちちゃうのでバリデーション
                if (si==0) {
                    continue;
                }
                // 現在いるマスの１つ上のマスが存在し、かつ、そのマスが「.」なら
                if (!grid.get(si-1).get(sj).isEmpty() && grid.get(si-1).get(sj).equals(".")) {
                    // 上のマスに移動する
                    si -= 1;
                }
            } else if (task.equals("D")) {
                // grid.get(si+1).get(sj)でぬるぽで落ちちゃうのでバリデーション
                if (si==H-1) {
                    continue;
                }
                // 現在いるマスの１つ上のマスが存在し、かつ、そのマスが「.」なら
                if (!grid.get(si+1).get(sj).isEmpty() && grid.get(si+1).get(sj).equals(".")) {
                    // 上のマスに移動する
                    si += 1;
                }
            }
        }
        // １列目と1行目を 0,0で表現しているので+1して戻す必要がある
        si += 1;
        sj += 1;
        System.out.println(si + " " + sj);
    }
}

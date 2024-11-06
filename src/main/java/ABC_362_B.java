import java.util.*;

public class ABC_362_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 斜辺の２乗が他の辺の２乗の和に等しい
        Point A = new Point(sc.nextInt(), sc.nextInt());
        Point B = new Point(sc.nextInt(), sc.nextInt());
        Point C = new Point(sc.nextInt(), sc.nextInt());
        // 各辺の長さを取得する(次の計算で確変の長さを２乗した状態の数字を使うので長さを取る処理だが平方根取るまではやらない。)
        double ABLength = Math.abs((Math.abs(A.x - B.x) * Math.abs(A.x - B.x)) + (Math.abs(A.y - B.y) * Math.abs(A.y - B.y)));
        double BCLength = Math.abs((Math.abs(B.x - C.x) * Math.abs(B.x - C.x)) + (Math.abs(B.y - C.y) * Math.abs(B.y - C.y)));
        double CALength = Math.abs((Math.abs(C.x - A.x) * Math.abs(C.x - A.x)) + (Math.abs(C.y - A.y) * Math.abs(C.y - A.y)));
        // x同士の差分の２乗 - y同士の差分の２乗 = cの２乗
        if (ABLength + BCLength == CALength || BCLength + CALength == ABLength || CALength + ABLength == BCLength) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static private class Point {
        public Integer x;
        public Integer y;
        Point(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
//        double ABLength = Math.sqrt((Math.abs(A.x - B.x) * Math.abs(A.x - B.x)) - (Math.abs(A.y - B.y) * Math.abs(A.y - B.y)));
//        double BCLength = Math.sqrt((Math.abs(B.x - C.x) * Math.abs(B.x - C.x)) - (Math.abs(B.y - C.y) * Math.abs(B.y - C.y)));
//        double CALength = Math.sqrt((Math.abs(C.x - A.x) * Math.abs(C.x - A.x)) - (Math.abs(C.y - A.y) * Math.abs(C.y - A.y)));
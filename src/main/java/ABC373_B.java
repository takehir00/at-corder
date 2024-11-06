import java.util.Scanner;

public class ABC373_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyLineString = sc.next();
        // Aから順にキーを探索してZと一致した時のindexを出力する

        // Aの座標を取得する
        int indexOfA = keyLineString.indexOf("A");

        // Zの座標を取得する
        int indexOfZ = keyLineString.indexOf("Z");

        // . . . .

        // A、Zとの座標の差分を取得する Zの座標がAより前の場合を考慮する必要がある
        if (indexOfA < indexOfZ) {
            System.out.println(indexOfZ - indexOfA);
        } else if (indexOfZ < indexOfA) {
            // aからlastIndexの差分　+ lastIndexからzのindex 例えば indexZ=0の場合は1
            int lastIndex = 25;
            System.out.println(lastIndex - indexOfA +  indexOfZ + 1);
        }


    }
}

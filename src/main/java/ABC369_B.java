import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 鍵盤を押す回数
        int N = sc.nextInt();
        // 疲労度
        int tiredPoint = 0;
        // 右手の位置と左手の位置をキャッシュしておく
        int currentRightPosition = 0;
        int currentLeftPosition = 0;

        int rightInputCount = 0;
        int leftInputCount = 0;

        for (int i = 0; i < N; i++) {
            String hand = sc.next();
            int nextPosition = sc.nextInt();
            if (hand.equals("R")) {
                // １回目の時だけ疲労度操作しない
                if (rightInputCount<=0) {
                    currentRightPosition = nextPosition;
                    rightInputCount++;
                    continue;
                }
                tiredPoint += Math.abs(currentRightPosition - nextPosition);
                currentRightPosition = nextPosition;
            } else if(hand.equals("L")) {
                // １回目の時だけ疲労度操作しない
                if (leftInputCount<=0) {
                    currentLeftPosition = nextPosition;
                    leftInputCount++;
                    continue;
                }
                tiredPoint += Math.abs(currentLeftPosition - nextPosition);
                currentLeftPosition = nextPosition;
            }
        }
        System.out.println(tiredPoint);
    }
}

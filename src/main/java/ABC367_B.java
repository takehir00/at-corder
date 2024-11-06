import java.util.*;
import java.util.stream.Collectors;

public class ABC367_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String[] stringList = X.split("");
        // reverseうまく行かないから後ろから取ることにした
        for (int i = 0; i < stringList.length; i++) {
            int targetIndex = stringList.length - 1 - i;
            if (stringList[targetIndex].equals(".")) {
                // .の直前が削除対象文字「*」だったら.も削除
                if (stringList[targetIndex+1].equals("*")) {
                    stringList[targetIndex] = "*";
                    break;
                }
                break;
            }
            if (stringList[targetIndex].equals("0")) {
                // ２週目以降、値が0でも前の要素が*じゃない場合は削除しない ex .505とか
                if (i > 0 && !stringList[targetIndex+1].equals("*")) continue;
                stringList[targetIndex] = "*";
            }
        }
        System.out.println(Arrays.stream(stringList).filter(ele->!ele.equals("*")).collect(Collectors.joining("")));
    }
}



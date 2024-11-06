import java.util.*;
import java.util.stream.Collectors;

public class ListAddTriggeringOutOfMemory {
    public static void main(String[] args) {
        String X = "1234";
        // ArrayListをnewするときにArrays.asListで作ったListを渡すと、後続処理でaddしたときにOutOfMemoryErrorが発生するっぽい
        // Collections.reverse使うときにこれやりたいんだよな。newするんじゃなくてString[]をループしてArrayListにaddするのが良さそう
        List<String> list = new ArrayList<>(Arrays.asList(X.split("")));
        for (int i = 0; i < list.size(); i++) {
            list.add(i,"*");
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}
// エラーログ　なんか各処理が２回ずつ呼ばれてる
// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//	at java.base/java.util.Arrays.copyOf(Arrays.java:3513)
//	at java.base/java.util.Arrays.copyOf(Arrays.java:3482)
//	at java.base/java.util.ArrayList.grow(ArrayList.java:237)
//	at java.base/java.util.ArrayList.grow(ArrayList.java:244)
//	at java.base/java.util.ArrayList.add(ArrayList.java:483)
//	at java.base/java.util.ArrayList.add(ArrayList.java:496)
//	at ListAddTriggeringOutOfMemory.main(ListAddTriggeringOutOfMemory.java:13)

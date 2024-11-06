import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ABC367_B_reverse {
    public static void main(String[] args) {
        String X = "1234";
        List<String> list = Arrays.asList(X.split(""));
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("2")) {
                list.set(i,"*");
            }
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}

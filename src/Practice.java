import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,1,1,11,2,3,4,5,5,6,7,7,7,7,7));

        list.removeIf(p -> p<5);

        System.out.println(list);
    }

}

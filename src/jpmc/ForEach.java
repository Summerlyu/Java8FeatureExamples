package jpmc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;

/**
 * Created by lvdandan on 29/11/2016.
 */
public class ForEach {
    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("each of the value is: " + integer);
            }
        });

    }
}

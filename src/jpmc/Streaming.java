package jpmc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by lvdandan on 29/11/2016.
 * <p>
 * parallel processing values are not in order, so parallel processing will
 * be very helpful while working with huge collections
 */
public class Streaming {
    public Streaming() {
    }

    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 130; i = i + 10) {
            myList.add(i);
        }

        Stream<Integer> seqStream = myList.stream();
        Stream<Integer> paraStream = myList.parallelStream();

        Stream<Integer> highNums = paraStream.filter(p -> p > 80);
        highNums.forEach(p -> System.out.println("high num parallel= " + p));

        Stream<Integer> highNumsSeq = seqStream.filter(p -> p > 80);
        highNumsSeq.forEach(p -> System.out.println("high num sequencial= " + p));

    }
}

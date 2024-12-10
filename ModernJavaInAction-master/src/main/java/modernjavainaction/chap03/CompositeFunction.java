package modernjavainaction.chap03;

import java.util.function.Function;

public class CompositeFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i + 1;
        Function<Integer, Integer> g = i -> i * 2;
        Function<Integer, Integer> h = f.andThen(g);

        System.out.println(h.apply(1));

    }
}

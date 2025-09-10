package modernjavainaction.chap04;

import static java.util.stream.Collectors.toList;
import static modernjavainaction.chap04.Dish.menu;

import java.util.List;
import java.util.stream.IntStream;

public class HighCaloriesNames {

    public static void main(String[] args) {
        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(toList());
        System.out.println(names);

        List<Integer> collect = IntStream.range(0, 0).boxed().collect(toList());

        var count = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println(count);
        System.out.println(collect.stream().map(d -> 1).reduce(0, (a, b) -> a + b));
    }

}

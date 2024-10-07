import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAula {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> integerStream = integersList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(integerStream.toArray()));

        Stream<String> stringStream = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stringStream.toArray()));

        Stream<Long> integerStream1 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(integerStream1.limit(10).toArray()));

    }
}

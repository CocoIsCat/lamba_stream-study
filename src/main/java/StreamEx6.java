import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[] {"abc", "def", "jkl"},
                new String[] {"ABC", "DEF", "JKL"}
        );

        Stream<String> stringStream = strArrStrm.flatMap(Arrays::stream);
        stringStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Arrays.stream(lineArr)
                .flatMap(line -> Stream.of(line.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

    }
}

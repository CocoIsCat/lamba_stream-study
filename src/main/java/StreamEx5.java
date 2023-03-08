import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        /*Stream<String[]> strArrStrm = Stream.of(
                new String[] { "abc", "def", "ghi"},
                new String[] { "ABC", "DEF", "GHI"}
        );

        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
        strStrm.forEach(System.out::println);*/

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        Stream<String> strArrStream = lineStream
                .flatMap(line -> Stream.of(line.split(" ")));

        strArrStream.map(String::toLowerCase)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}

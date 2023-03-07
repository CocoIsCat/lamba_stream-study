import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        /*String[] strArr = {"bbb", "aaa", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        strStream1.sorted().forEach(System.out::println);
        System.out.println();
        strStream2.sorted().forEach(System.out::println);

        List<String> sortedList = strStream2.sorted().collect(Collectors.toList());*/

        String[] strArr = {"dd", "aaa", "CC", "cc", "b", "aaa", "cc"};
        //List<String> strList = Arrays.asList(strArr);
       /* Stream<String> stream = Stream.of(strArr);
        stream.forEach(System.out::println);*/
        /*System.out.println();
        Stream<String> stream2 = Arrays.stream(strArr);
        stream2.forEach(System.out::println);
        System.out.println();
        Stream<String> stream3 = strList.stream();
        stream3.forEach(System.out::println);*/

        /*System.out.println();
        Stream.of(strArr).filter(s -> s.length() == 2).forEach(System.out::println);*/

        /*System.out.println();
        Arrays.stream(strArr).distinct().forEach(System.out::println);*/

        /*System.out.println();
        Stream.of(strArr).sorted().forEach(System.out::println);*/

        /*System.out.println();
        Stream.of(strArr).limit(5).forEach(System.out::println);*/

        /*System.out.println("Arrays.stream(strArr).count() = " + Arrays.stream(strArr).count());
        System.out.println("Arrays.stream(strArr).distinct().count() = " + Arrays.stream(strArr).distinct().count());*/

        System.out.println();
        Stream.of(strArr).distinct().sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);
    }
}

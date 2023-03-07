import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::println);*/

        /*Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);

        IntStream intStream1 = IntStream.range(1, 5);
        intStream1.forEach(i -> System.out.print(i + ", "));
        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(1, 5);
        intStream2.forEach(i -> System.out.print(i + ", "));*/

        /*long start1 = System.currentTimeMillis();
        IntStream intStream1 = new Random().ints(5, 0, 100);
        intStream1.forEach(i -> System.out.print(i + ", "));
        long finish1 = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (finish1 - start1));

        int[] list = new int[5];
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            list[i] = (int)(Math.random()*100 + 1);
        }
        for (int i : list) {
            System.out.print(i + ", ");
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (finish2 - start2));*/

        /*IntStream evenStream = IntStream.iterate(0, n -> n + 2).limit(5);
        evenStream.forEach(i -> System.out.print(i + ", "));*/

        /*String[] str1 = {"123", "456", "789"};
        String[] str2 = {"abc", "def", "ghi"};
        Stream<String> strs1 = Stream.of(str1);
        Stream<String> strs2 = Arrays.stream(str2);
        Stream<String> strs3 = Stream.concat(strs1, strs2);
        strs3.forEach(System.out::println);*/
    }
}

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {

        BiFunction<Long, Long, Long> f = (st, ft) -> ft - st;

        Stream<Student> studentStream0 = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("권자바", 3, 180)
        );

        long start0 = System.currentTimeMillis();
        Stream<Integer> integerStream = studentStream0.map(Student::getScore);
        integerStream.distinct()
                .sorted()
                .forEach(i -> System.out.println("점수 : " + i));
        long finish0 = System.currentTimeMillis();
        System.out.println("실행시간 : " + f.apply(start0, finish0));
        System.out.println();

        Stream<Student> studentStream1 = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("권자바", 3, 180)
        );

        long start1 = System.currentTimeMillis();
        studentStream1.sorted(Comparator.comparing(Student::getScore))
                .map(Student::getScore)
                .distinct()
                .forEach(i -> System.out.println("점수 : " + i));
        long finish1 = System.currentTimeMillis();
        System.out.println("실행시간 : " + f.apply(start1, finish1));
        System.out.println();

        Stream<Student> studentStream2 = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("권자바", 3, 180)
        );

        long start2 = System.currentTimeMillis();
        IntStream intStream = studentStream2.mapToInt(Student::getScore);
        intStream.distinct()
                .sorted()
                .forEach(i -> System.out.println("점수 : " + i));
        long finish2 = System.currentTimeMillis();
        System.out.println("실행시간 : " + f.apply(start2, finish2));
    }
}

import java.util.Comparator;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
    String name;
    int ban;
    int score;

    public Student(String name, int ban, int score) {
        this.name = name;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban='" + ban + '\'' +
                ", score=" + score +
                '}';
    }

    public int compareTo(Student s) {
        return s.score - this.score;
    }
}

public class StreamEx3 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("권자바", 3, 180)
        );

        /*studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.reverseOrder() ))
                .forEach(System.out::println);*/

        studentStream.map(Student::getName)
                .filter(s -> !s.contains("이"))
                .peek(s -> System.out.println("이름 : " + s))
                .forEach(System.out::println);
    }
}

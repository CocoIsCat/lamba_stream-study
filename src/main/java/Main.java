import java.util.Arrays;
import java.util.Collections;
import java.util.function.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*int a = 3, b = 5;
        //익명 클래스 생성
        MyFunction1 f1 = new MyFunction1() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        int big2 = f1.max(a, b);

        //람다
        MyFunction1 f2 = (x, y) -> x > y ? x : y;
        int big3 = f2.max(a, b);*/


        /*MyFunction2 f = () -> System.out.println("f1.run()");

        MyFunction2 f1 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction2 f2 = getMyFunction();

        f.run();
        f1.run();
        f2.run();

        execute(f2);
        execute(() -> System.out.println("run()"));
    }

    static void execute(MyFunction2 f) {
        f.run();
    }

    static MyFunction2 getMyFunction() {
        MyFunction2 f = () -> System.out.println("f3.run()");
        return f;
    }*/

        /*MyFunction3 f = () -> {};   //MyFunction3 f = (MyFunction3)(() -> {});
        Object obj = (MyFunction3)(() -> {});
        String str = ((Object)(MyFunction3)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);*/


        /*Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);*/

/*        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s = "abc";

        if (isEmptyStr.test(s)) {
            System.out.println("This is an empty String");
        }*/
    }
}
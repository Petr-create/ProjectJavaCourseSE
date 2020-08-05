package LessonTest;

import homework.LessonTest.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class, timeout = 1000)
    public void checkZeroException() {
        MyMath.divide(1, 0);
    }
}

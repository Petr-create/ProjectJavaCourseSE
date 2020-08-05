package homework.LessonTest;

public class MyMath {
    public static double divide(int num1, int num2){
        if(num2 == 0)
            throw new ArithmeticException("Делить на ноль нельзя!");
        return num1 / num2;
    }
}

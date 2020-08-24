package homework.Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
//        throw  new IndexOutOfBoundsException();
        try {
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("Поймали ошибку");
        }

        try {
            exceptionMethod();
            throw new Exception();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }

        throw new MyFavoriteException("Супер ошибка");
    }
    public static void exceptionMethod() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

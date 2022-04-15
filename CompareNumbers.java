package ee.homeproject.first;
/*
Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите.
 Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 */
public class CompareNumbers {
    public static void compareNumbers(String [] args){
        int a = 9;
        int b = 8;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else  {
            System.out.println("a < b");
        }

    }
}

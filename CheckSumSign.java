package ee.homeproject.first;

/*
Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
в противном случае - “Сумма отрицательная”;
*/
public class CheckSumSign {
    public static void checkSumSign(String [] args){
        int a = 7;
        int b = 8;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная!");
        }
        else  {
            System.out.println("Сумма отрицательная!");
        }

    }
}

package ee.homeproject.first;

/*Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
Orange
Banana
Apple
 */

public class FirstApp {
        // Aleksei Faraon
        // 1.Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void main(String [] args){
        System.out.println("Hello, this is my first step in Java...");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        }
    }


/*
2.Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
в противном случае - “Сумма отрицательная”;
*/
class SumSignCheck {
    private static void main(String [] args){
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

/*
3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;
 */
class ColorPrint {
    public static void printColor(String[] args) {
        int znach = 77;
        if (znach <= 0) {
            System.out.println("RED");
        }
        if (znach > 1 && znach < 100) {
            System.out.println("YELLOW");
        }
        if (znach > 101) {
            System.out.println("GREEN");
        }
        System.out.println("GoodJob");
    }
}


/*
4.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите.
 Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 */
class CompareNumbers {
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












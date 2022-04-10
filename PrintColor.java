package ee.homeproject.first;

/*
4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;

 */

public class PrintColor {
    public static void main(String[] args) {
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

// Тут не верент в значениях 0, 100. если не правильно подскажите пожалуйста!
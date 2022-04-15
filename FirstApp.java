package ee.homeproject.first;

public class Lesson2 {
    public static void main(String[] args) {

    }
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public static boolean  methodOne(int a, int b){
        int sum = a + b;
        if ((a+b <= 20) && (a+b >= 10)) {
            return true;
        } else {
            return false;
        }
    }

//2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
public static void NegOrPosNumber(int num) {
    if (num >= 0) {
        System.out.println("Positive");
    } else {
        System.out.println("Negative");
    }
}


//3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
public static boolean TrueOrFalse(int sum){
        if (sum >= 0) {
            return true;
        } else {
            return false;
        }
}

//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз
public static void printStringNum(String word, int number) {
        printStringNum("Hello", 5);
}

}







import java.util.Scanner;

public class dZ1 {
    public static void main(String[] args) {

    }

    static void dz1() {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число больше 1");
        int num = Integer.parseInt(scanner.nextLine());
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        System.out.println("Cумма чисел от 1 до " + num + " равна " + res);

    }

    static void dz2() {
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для расчёта факториала");
        int num = Integer.parseInt(scanner.nextLine());
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println("Факториал числа " + num + " равен " + res);

    }

    static void dz3() {
        /*
        Вывести все простые числа от 1 до 1000 (простые числа - это числа
        которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        for (int i = 2; i < 1001; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }


        }

    }

    static void dz4() {
        /*
        Реализовать простой калькулятор ("введите первое число"...
        "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите знак: ");
        String symbol = scanner.nextLine();
        System.out.println("Введите второе число: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        if (symbol.contains("+")) {
            int resPlus = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resPlus);
        } else if (symbol.contains("-")) {
            int resMinus = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resMinus);
        } else if (symbol.contains("*")) {
            int resMult = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + resMult);
        } else if (symbol.contains("/")) {
            int resDiv = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resDiv);
        } else {
            System.out.println("Неверная операция, попробуйте еще раз");
        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте! Эта простая программа спросит у Вас два целых числа" +
                "\nсравнит их и выполнит с ними одно из четырёх введёных вами дейсвий, " +
                "\nа именно: сложение, вычитание, умножение или деление");

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println("первое число больше");
        } else if (first < second) {
            System.out.println("второе число больше");
        } else {
            System.out.println("числа равны");
        }

        System.out.print("Введите знак операции: ");
        char operation  = scanner.next().charAt(0);

        switch (operation){
            case '+':
                int res1 = first + second;
                System.out.println("результат " + res1);
                break;
            case '-':
                int res2 = first - second;
                System.out.println("результат " + res2);
                break;
            case '*':
                int res3 = first * second;
                System.out.println("результат " + res3);
                break;
            case '/':
                int res4 = first / second;
                int ost = first% second;
                System.out.println("результат " + res4 + " с остатком " + ost);
                break;



        }

    }
}
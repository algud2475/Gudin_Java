import java.util.Scanner;

public class TaskOne {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber > 7) {
            System.out.println("Привет!");
        }
    }
}

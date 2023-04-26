public class TaskThree {
    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //тестовый массив
        printNumbersDivisibleBy3(inputArray);
    }

    public static void printNumbersDivisibleBy3(int[] inputArray) {
        for (int number : inputArray) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}

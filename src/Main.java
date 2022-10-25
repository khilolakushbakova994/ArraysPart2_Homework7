import java.util.Arrays;
public class Main {
    int[] expenses = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма затрат за месяц равна " + sum + "рублей ");
        System.out.println();


        // Задача номер 2
        int minSalary = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minSalary) {
                minSalary = arr[i];
            }
        }
        System.out.println("Минимальная сумма затрат за один день составила " + minSalary);
        System.out.println();
        int maxSalary = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSalary) {
                maxSalary = arr[i];
            }
        }
        System.out.println("Максимальная сумма затрат за один день составила " + maxSalary);
        System.out.println();


        //Задача 3
        double averageSalary = sum / arr.length;;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей");


        //Задача 4
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

















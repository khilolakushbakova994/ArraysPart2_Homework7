import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            {

        {
            {
                {
                    {

                        //Задание 1: Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
                        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
                        //в формате: «Сумма трат за месяц составила … рублей».

                        System.out.println("Task Number 1\n");

                        int[] expenses = new int[30];
                        for (int i = 0; i < expenses.length; i++) {
                            expenses[i] = (int) (100_000 + Math.random() * 100_000);
                        }
                        System.out.println("Сумма трат за месяц составила:");
                        System.out.println(Arrays.toString(expenses));
                        System.out.println("Task Number 2\n");
                    }
                    //Задание 2: Следующая задача — найти минимальную и максимальную трату за день.
                    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
                    //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила
                    // … рублей».


                    int[] expenses = new int[30];
                    int min = 500_000;
                    for (int i = 0; i < expenses.length; i++) {
                        expenses[i] = (int) (100_000 + Math.random() * 100_000);
                        if (expenses[i] < min) min = expenses[i];
                    }
                    System.out.println("Минимальная сумма трат за день составила   " + min + "рублей");
                }
            }
            int[] expenses = new int[30];
            int max = 50_000;
            for (int i = 0; i < expenses.length; i++) {
                expenses[i] = (int) (100_000 + Math.random() * 100_000);
                if (expenses[i] > max) max = expenses[i];
            }

            System.out.println("Максимальная сумма трат за день составила   " + max + "рублей\n");
        }

        System.out.println("Task Number 3\n");

        //### Задание 3: А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за
        // месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц
        // составила … рублей».
        //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, a дробным числом).


        double[] expenses = new double[30];
        double totalAmount = 0;
        for (double k = 0; k < expenses.length; k++) {
            expenses[(int) k] = (int) (100_000 + Math.random() * 100_000);
            totalAmount = totalAmount + expenses[(int) k];
        }
        System.out.println("Средняя сумма трат за месяц составила  " + totalAmount / expenses.length + "рублей\n");
    }
}

        System.out.println("Task Number 4\n");
        //Задание 4: Отойдем от подсчетов. В нашей бухгалтерской книге появился баг. Что-то пошло нет так,
        // и Ф.И.О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем
        // «чивонавИ навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        //**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        // массиву циклом и распечатать его элементы в правильном порядке.

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print(reverseFullName [10]);
        System.out.print(reverseFullName [9]);
        System.out.print(reverseFullName [8]);
        System.out.print(reverseFullName [7]);
        System.out.print(reverseFullName [6]);
        System.out.print(reverseFullName [5]);
        System.out.print(reverseFullName [4]);
        System.out.print(reverseFullName [3]);
        System.out.print(reverseFullName [2]);
        System.out.print(reverseFullName [1]);
        System.out.print(reverseFullName [0]);
        System.out.println("\n");








    }



    }


















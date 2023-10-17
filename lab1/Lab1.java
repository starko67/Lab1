package lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        // пункт 3
        int count = 0;
        int sum = 0;
        double sr = 0;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите сами элементы:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
             count = count+1;
             sum = sum+array[i];
        }
        sr=sum/(double)count;
        System.out.println ("сумма:" +sum);
        System.out.println ("среднее значение:" +sr);

        // пункт 4
        System.out.println("Введите количество элементов: ");
        int size2 = input.nextInt();
        int sum2=0;
        int max=0;
        int min=999999;
        int mas[] = new int[size2];
        System.out.println("Введите сами элементы:");
        int i = 0;
        while (i<size2) {
            mas[i] = input.nextInt();
            i=i+1;
        }
        i = 0;
        while (i<size2){
            sum2=sum2+mas[i];
            i=i+1;
        }
        i = 0;
        while (i<size2){
            if (mas[i]<min){
                min=mas[i];
            }
            if (mas[i]>max){
                max=mas[i];
            }
            i=i+1;
        }
        System.out.println("Минимальное:"+min);
        System.out.println("Максимальное:"+max);
        System.out.println("Сумма:"+sum2);

        //пункт 5
        System.out.println("Аргументы командной строки");
        for (i=0;i< args.length;i++){
            System.out.println("Аргумент"+(i+1)+":"+args[i]);
        }

        //пункт 6
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("H(%d) = %.4f%n", i, harmonic);
        }

        //пункт 7
        System.out.println("Введите число для которого хотите посчитать факториал:");
        int number=input.nextInt();
        long factorial=calculate(number);
        System.out.println(number+"!="+factorial);
    }
    public static long calculate(int n) {
       if (n==0||n==1){
           return 1;
       }long result=1;
       for (int i=2;i<=n;i++){
           result*=i;
       }
       return result;
    }
    }

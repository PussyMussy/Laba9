package Zadanie2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Job1_2 {
    public static void main(String[] args) {
        int k = 3;
        int v =0;
        int col = 0;
        int m = 5;
        int size = k;
        int size2 = m;
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[][] nums = new int[size][size2]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < 3 ; i++ ){
            System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 5 ; j++ )
            {
                nums[i][j] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
                System.out.print(" [" +i +  j+ "]    " + nums[i][j] + " | "); // Сообщение пользователю "для красоты и понимания"
            }
        }
        System.out.println("");
        System.out.println("Какой столбец массива вывести?");
        System.out.println("Введите номер столбца:");
        Scanner id = new Scanner(System.in);
        try {
            col = id.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введен символ или знак, а нужно указать цифру");
        }
        while (v<3) {
                try {
                    System.out.println(nums[v][col]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Нет такой строки в массиве. Число либо отрицательное либо слишком большое ");
                }
                v++;
            }
    }
}

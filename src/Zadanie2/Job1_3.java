package Zadanie2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Job1_3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size = 0;
        try {
            size = id.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Введено слишком большое число, введен знак или символ");
        }
        byte sum = 0;
        int[] nums = new int[0];
        try {
            nums = new int[size];
        }
        catch (Exception e) {
            System.out.println("Длинна массива не должна быть отрицательна или = 0 ");
        }
        for (int i = 0 ; i < nums.length ; i++ ) {
            System.out.println("Введите числа: ");
            byte a = 0;
            try {
                a = id.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Введено слишком большое число, введен знак или символ");
            }
            nums[i] = a;
            sum = (byte) (sum+a);
        }
        System.out.println(sum+" Сумма чисел");
        System.out.println(nums.length+" Всего чисел");
        try {
            sum = (byte) (sum/nums.length);
        } catch (ArithmeticException e) {
            System.out.println("Длинна массива не должна быть отрицательна или = 0 ");
        }
        System.out.println(sum+" Среднее арифметическое");
    }}
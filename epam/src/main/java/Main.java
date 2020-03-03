import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

/*//       Main Task
//1.     Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = in.nextLine();
        System.out.println("Hello " + name);
//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.println("Enter argument: ");
        int argument = in.nextInt();
        StringBuilder backwards = new StringBuilder();
        while (argument != 0) {
            backwards.append(argument % 10);
            argument = argument / 10;
        }
        System.out.println("Argument backwards: " + backwards);
//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        System.out.println("Enter amount of random numbers");
        int amountOfRandomNumbers = in.nextInt();
        System.out.println("With transition on newline");
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            Random rand = new Random();
            System.out.println(rand.nextInt(25));
        }
        System.out.println("Without transition on newline");
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            Random rand = new Random();
            System.out.print(rand.nextInt(25) + " ");
        }
//4.      Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        int sum = 0;
        int multiply = 1;
        for(String digi: args){
            sum= sum + Integer.parseInt(digi);
        }
        System.out.println("Sum of numbers: " + multiply);
        for(String digi: args){
            multiply= multiply * Integer.parseInt(digi);
        }
        System.out.println("Multiply of numbers: " + multiply);

//        5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//        Осуществить проверку корректности ввода чисел.
        int numberOfMonth = in.nextInt();
        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong number entered, try again");
        }*/

//        Optional task1
//        1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        int min = 10, max = 0;
        String minStr = null, maxStr = null;
        for (String digi : args) {
            if (digi.length() < min) {
                min = digi.length();
                minStr = digi;
            }
            if (digi.length() > max) {
                max = digi.length();
                maxStr = digi;
            }
        }
        System.out.println("Минимальное число " + minStr + " состоит из " + min
                + " цифр\nМаксимальное число " + maxStr + " состоит из " + max
                + " цифр");
//        2.     Вывести числа в порядке возрастания (убывания) значений их длины
        for(int i = args.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( args[j].length() > args[j+1].length() ){
                    String tmp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}

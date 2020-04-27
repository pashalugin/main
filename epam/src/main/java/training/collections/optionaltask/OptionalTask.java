package training.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask {
    public static void main(String args[]) throws FileNotFoundException {
//              Optional Task
//     2.Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Stack stack = new Stack();
        char[] numbers = String.valueOf(number).toCharArray();
        for (char num : numbers) {
            stack.push(num);
        }

        while (!stack.empty()) {
            char mirrorNumber = (Character) stack.pop();
            System.out.print(mirrorNumber);
        }
        System.out.println();
        //       6.Ввести строки из файла, записать в список ArrayList.
        //       Выполнить сортировку строк, используя метод sort() из класса Collections.
        Scanner scan = new Scanner(new File("./poem.txt"));
        ArrayList<String> arrStr = new ArrayList<>();
        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);
        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}

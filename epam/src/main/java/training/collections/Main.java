package training.collections;

import training.collections.newyearpresent.Box;
import training.collections.newyearpresent.Candy;
import training.collections.newyearpresent.SugarCandy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
//       Main task
        /*2. Новогодний подарок.
         Определить иерархию конфет и прочих сладостей.
         Создать несколько объектов-конфет.
         Собрать детский подарок с определением его веса.
         Провести сортировку конфет в подарке на основе одного из параметров.
         Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/

     ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Snickers", 1, 900, 1000));
        candies.add(new Candy("Bounty", 0.5, 800, 900));
        candies.add(new SugarCandy("Mars", 0.1, 1200, 220, "Mars"));
        Box box = new Box(candies);
        box.sortCandysByWeigth();
        box.getCandyFromCaloriesRange(500, 1000);
        System.out.println(box);
//       Optional Task
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
        //       6.Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
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

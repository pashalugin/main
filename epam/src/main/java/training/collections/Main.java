package training.collections;

import training.collections.candies.Chocolate;
import training.collections.candies.Marmalade;
import training.collections.candies.Candy;
import training.collections.types.ChocolateType;
import training.collections.types.MarmaladeType;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
//       Main task
        /*2. Новогодний подарок.
         Определить иерархию конфет и прочих сладостей.
         Создать несколько объектов-конфет.
         Собрать детский подарок с определением его веса.
         Провести сортировку конфет в подарке на основе одного из параметров.
         Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/

        List<Candy> candy = new ArrayList<>();


        candy.add(new Chocolate("Арахисовые", 60, 9.99, 533, 45, 25, ChocolateType.STUFFED_CHOCOLATE));
        candy.add(new Chocolate("Kit-kat", 60, 14.99, 530, 42, 19, ChocolateType.WITH_WAFFLE));
        candy.add(new Chocolate("CandyNut", 60, 8.50, 460, 55, 22, ChocolateType.STUFFED_CHOCOLATE));
        candy.add(new Chocolate("Белорусские", 60, 12.50, 415, 45, 42, ChocolateType.PURE_CHOCOLATE));
        candy.add(new Chocolate("Choco", 60, 15.99, 436, 38, 48, ChocolateType.PURE_CHOCOLATE));

        candy.add(new Marmalade("Апельсинка", 50, 4.69, 330, 65, 20, MarmaladeType.ORANGE));
        candy.add(new Marmalade("Грушевые дольки", 75, 5.50, 342, 50, 25, MarmaladeType.PEAR));
        candy.add(new Marmalade("Boom", 50, 6.49, 345, 65, 15, MarmaladeType.ORANGE));
        candy.add(new Marmalade("Haribo", 100, 6.49, 332, 48, 20, MarmaladeType.APPLE));
        candy.add(new Marmalade("JellyBean", 75, 17.50, 352, 65, 15, MarmaladeType.LEMON));

        CandyLogic cl = new CandyLogic();

        System.out.println("1. Определить итоговый вес конфет в собранном подарке.");
        System.out.println("2. Отсортировать конфеты по возрастанию калорийности.");
        System.out.println("3. Найти конфеты из подарка в заданном диапазоне содержания сахара.");
        System.out.println("0. Выход.");
        System.out.print("Введите номер требуемого действия: ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Вес подарка: " + cl.getFullWeightOfGift(candy) + "гр.\n");
                break;
            case 2:
                System.out.println("Конфеты, отсортированные по калорийности: ");
                for (Candy c : cl.sortByCalories(candy)) {
                    System.out.println(c);
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Введите начало диапазона: ");
                int minValue = sc.nextInt();
                System.out.print("Введите конец диапазона: ");
                int maxValue = sc.nextInt();
                System.out.println("Конфеты с заданным содержанием сахара: ");
                for (Candy c : cl.findCandiesGivenPersentageSugar(candy, minValue, maxValue)) {
                    System.out.println(c);
                }
                System.out.println();
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Неверный ввод.");
        }


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

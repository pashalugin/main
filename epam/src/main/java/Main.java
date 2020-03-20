import newyearpresent.Box;
import newyearpresent.Candy;

import java.io.IOException;
import java.util.*;

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

/*//        Optional task
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
        }*/

/* Main task
 Создать классы, спецификации которых приведены ниже.
 Определить конструкторы и методы setТип(), getТип(), toString().
 Определить дополнительно методы в классе, создающем массив объектов.
 Задать критерий выбора данных и вывести эти данные на консоль.
 В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.]
 2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 Создать массив объектов. Вывести:
 a) список покупателей в алфавитном порядке;
 b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

       /* Shop market = new Shop("Keshenya");
        market.addCustomerToShopList(new Customer("Павел", "Лугин", "Михайлович", "ул. Темерязева д.23", 56456654, 213123));
        market.addCustomerToShopList(new Customer("Ваня", "Гавриенко", "Васильевич","ул. Новикова д.10", 45645665, 1663218));
        market.addCustomerToShopList(new Customer("Алексей", "Лугин", "Андреевич","ул. Василькова д.9", 5454354, 1554598));
        market.addCustomerToShopList(new Customer("Виктор", "Бодриенко", "Михайлович","ул. Гароедова д.15", 5435455, 47656585));
        market.addCustomerToShopList(new Customer("Артём", "Гордей", "Павлович","ул. Павлушнкина д.10", 6576576, 26569));

        System.out.println("\nsort by name:");
        List<Customer> listSortByName = market.getListName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort by surname:");
        List<Customer> listSortBySurname = market.getListSurname();
        for (Customer c : listSortBySurname) {
            System.out.println(c);
        }

        System.out.println("\ndiapason card number:");
        List<Customer> diapasonCardumber = market.getListDiapasonCardNumber(2545482, 5544556);
        for (Customer c : diapasonCardumber) {
            System.out.println(c);
        }*/

//       Main task
        /*2. Новогодний подарок.
         Определить иерархию конфет и прочих сладостей.
         Создать несколько объектов-конфет.
         Собрать детский подарок с определением его веса.
         Провести сортировку конфет в подарке на основе одного из параметров.
         Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/

/*      ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Snickers", 1, 900, 1000));
        candies.add(new Candy("Bounty", 0.5, 800, 900));
        Box box = new Box(candies);
        box.sortCandysByWeigth();
        box.getCandyFromCaloriesRange(500, 1000);
        System.out.println(box);*/

//       Optional Task
//     2.Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

/*        Scanner in = new Scanner(System.in);
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
        }*/
    }
}














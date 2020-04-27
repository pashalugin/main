package training.fundamentals;

public class OptionalTask2 {
    public static void main(String args[]) {
        //        Optional task 2
        //        2.Вывести числа в порядке возрастания (убывания) значений их длины
        for (int i = args.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (args[j].length() > args[j + 1].length()) {
                    String tmp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

package training.fundamentals;

public class OptionalTask1 {
    public static void main(String args[]) {
//        Optional task 1
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
    }
}

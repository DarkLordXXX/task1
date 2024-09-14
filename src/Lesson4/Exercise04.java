package Lesson4;

public class Exercise04 {
    public static void main(String[] args) {
        //4.4) Напишіть програму на Java, щоб перевірити, чи містить масив певне значення.
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toFind = 5;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " знайшов.");
        } else {
            System.out.println(toFind + " не знайшов.");
        }
    }
}

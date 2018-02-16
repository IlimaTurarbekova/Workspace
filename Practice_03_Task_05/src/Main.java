import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.printf("%d НЕ является високосным годом.\n", year);
        } else if (year % 100 != 0) {
            System.out.printf("%d является високосным годом.\n", year);
        } else if (year % 400 != 0) {
            System.out.printf("%d НЕ является високосным годом.\n", year);
        } else {
            System.out.printf("%d является високосным годом.\n", year);
        }
   
    }

}

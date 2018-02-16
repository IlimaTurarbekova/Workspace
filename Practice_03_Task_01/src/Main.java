import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите вещественное число: ");
		double number = scanner.nextDouble();
		double result = number;
		if (result < 0) {
			result *= -1;
		}
		System.out.printf("|%.2f| = %.2f\n", number, result);
	}

}

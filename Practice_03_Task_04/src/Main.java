import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите первое число: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Введите второе число: ");
		int secondNumber = scanner.nextInt();
		System.out.print("Введите третье число: ");
		int thirdNumber = scanner.nextInt();
		
		int maximum;
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				maximum = firstNumber;
			} else {
				maximum = thirdNumber;
			}
		} else {
			if (secondNumber > thirdNumber) {
				maximum = secondNumber;
			} else {
				maximum = thirdNumber;
			}
		}
		System.out.printf("Значение %d является максимальным.\n", maximum);
	}
}

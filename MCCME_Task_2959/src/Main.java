import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n > 0) {
			System.out.print(1);
		}
		if (n < 0) {
			System.out.print(-1);
		}
		if (n == 0) {
			System.out.print(0);
		}

	}

}

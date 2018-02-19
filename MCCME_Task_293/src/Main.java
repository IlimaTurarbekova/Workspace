import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if (n1 > n2) {
			System.out.print(1);
		} else if (n2 > n1) {
			System.out.print(2);
		} else if (n1 == n2) {
			System.out.print(0);
		}
	}

}

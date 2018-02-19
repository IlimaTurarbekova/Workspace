import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if ((n1 != 1 && n2 != 1) || (n1 == 1 && n2 == 1)) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num = 0;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		num += 0.1;
		System.out.printf("%.2f\n", num);
		if (num == 1.0) {
			System.out.println("Equal");
		} else {
			System.out.println("NOT equal");
		}
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int max = 0;
		if (n1 >= n2  && 
			n1 >= n3) {
			max = n1;
		} else if (n2 >= n1 &&
				   n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}
		System.out.print(max);
	}

}

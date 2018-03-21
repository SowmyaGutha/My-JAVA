package MyPackage;

public class Array {

	public void prime(int row, int col) {

		int prime[] = new int[20];

		int temp = 0;
		for (int i = 2; i < 20; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i > 2) {
					// System.out.println(i + " is not a Prime No");
					break;
				} else {
					prime[temp] = i;
					// System.out.println(i);
					temp++;
					break;
				}
			}
		}

		int var = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(prime[var] + " ");
				var++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Array p = new Array();
		p.prime(3, 4);

	}
}

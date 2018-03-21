package MyPackage;

public class Array2 {

	public void prime(int row, int col) {

		int prime[] = new int[200];
		int temp = 0;
		for (int i = 2; i < 200; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime[temp] = i;
				temp++;
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
		Array2 p = new Array2();
		p.prime(5, 7);

	}
}

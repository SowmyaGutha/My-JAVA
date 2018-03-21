package MyPackage;

public class PrimeNumbers {

	public void prime() {

		int prime[] = new int[100];

		int temp = 0;
		for (int i = 2; i < 100; i++) {
			if (i == 2) {
				prime[temp] = i;
				System.out.println("prime[temp] " + prime[temp] + " " + " i: " + i);
				temp++;
			}
			for (int j = 2; j <=i; j++) {
				if (i % j == 0) {
					System.out.println("i: " + i + " " + "j: " + j);
					break;
				} else {
					prime[temp] = i;
					System.out.println("prime[temp] " + prime[temp] + " " + " i: " + i);
					temp++;
					break;
				}
			}
		}

		int var = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("prime[var] " + prime[var] + " ");
				var++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers();
		p.prime();

	}
}

package Mypackage;

public class StartPattrens {
	public void squarePattren() {
		int i, j, k = 1;
		int num[][] = new int[4][4];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				num[i][j] = k;
				k++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void lPattren() {
		int i, j, k = 1;
		int num[][] = new int[6][6];
		for (i = 0; i < 6; i++) {
			for (j = 0; j <=i; j++) {
				num[i][j] = k;
				k++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void ultaLPattren() {
		int val = 8;
		for (int i = 1; i <= val; i++) {
			for (int j = 1; j <= val - i; j++) {
				System.out.print("(" + i + "," + j + ") "+ " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("(" + i + "," + j + ") "+ "1");
			}
			System.out.println("");
		}
	}

	


	public static void main(String[] args) {

		StartPattrens t = new StartPattrens();
		//t.squarePattren();
		t.lPattren();
		//t.ultaLPattren();

	}
}

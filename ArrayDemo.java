package MyPackage;

public class ArrayDemo {

	public void singleDimensionArray() {

		/* Adding and displaying values to single dimension array */

		int value = 1;
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = value;
			value++;
			System.out.println("num[" + i + "] :" + num[i]);
		}
	}
	public void twoDimensionArray() {

		/* Adding and displaying values to two dimension array */

		int value = 1;
		int num[][]= new int[5][5];
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
			num[i][j] = value;
			value++;
		}
		}
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5;j++) {
			System.out.println("num[" + i + "]"+"["+j+"] :" + num[i][j]);
		}
		}
	}

	public static void main(String[] args) {
		ArrayDemo d = new ArrayDemo();
		d.singleDimensionArray();
		d.twoDimensionArray();

	}
}
package MyPackage;

public class NumberPattren {

	public void square() {
		int i, j, k = 1;

		int num[][] = new int[5][5];
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				num[i][j] = k;
				k++;
			}
		}
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				System.out.print(num[i][j] + " ");

			}
			System.out.println();
		}
	}

	public void lPattren()
	{
		int k=1;
		for(int i=1; i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
	
	public void antiLpattren()
	{
		int k=1;
		for(int i=5; i>1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
	
	public void ultaLPattren()
	{
		int k=1;
		for(int i=1; i<5;i++)
		{
			for(int j=5; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
		
	}
	
	public void ultaLPattren1()
	{
		for(int i=5; i>0;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<i)
				System.out.print(" ");
				else
				System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		NumberPattren p = new NumberPattren();
		//p.square();
		//p.lPattren();
		//p.antiLpattren();
		//p.ultaLPattren();
		p.ultaLPattren1();
	}
}

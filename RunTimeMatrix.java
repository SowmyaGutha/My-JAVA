package MyPackage;

public class RunTimeMatrix {

public void matrix(int v1, int v2)
{
int k=1;
for(int i=0;i<v1;i++)
{
	for(int j=0;j<v2;j++)
	{
		System.out.print(k);
		k++;
	}
	System.out.println();
}

}
	
public static void main(String[] args) {
	
int v1= Integer.parseInt(args[0]);
int v2= Integer.parseInt(args[1]);
 
RunTimeMatrix r =new RunTimeMatrix();
 r.matrix(v1, v2);

}
}

package MyPackage;

public class Array1 {
public static void main(String[] args) {
	int numbers[]= { 10,20,30,40,50} ;
	System.out.println(numbers.length);
	String names[] = { "Sowmya", "Ramya","Sudheer"};
	for(int x: numbers)
	{
		System.out.print(x +" " );
		
	}
	System.out.println();
	for(int i=0;i<3;i++)
	{
		System.out.print(names[i] + " ");
	}
}
}

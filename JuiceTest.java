package MyPackage;

class Enums
{
	enum juiceSize { SMALL , MEDIUM, LARGE} 
	juiceSize size;
}
public class JuiceTest
{
	public static void main(String[] args) {
		Enums e = new Enums();
		e.size = Enums.juiceSize.LARGE;
		System.out.println("Juice size is : " + e.size);
	}
}

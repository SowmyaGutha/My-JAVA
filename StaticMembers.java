package MyPackage;

public class StaticMembers {
	static int a;
	final static String NAME="sowmya";
	public void test()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		a=100;
		System.out.println(a);
		StaticMembers s=new StaticMembers();
		s.test();
		System.out.println(NAME);
		
	}

}

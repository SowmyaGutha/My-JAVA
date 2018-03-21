package MyPackage;

public class Constructors {
	String name;
	public Constructors(String string) {
		this.name=string;
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		new Constructors("sowmya");
	}
}

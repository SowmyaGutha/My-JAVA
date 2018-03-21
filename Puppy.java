package MyPackage;

public class Puppy {
int puppyAge;

	public void setAge(int age)
	{
		this.puppyAge = age;
	}
	public int getAge()
	{
		
		System.out.println(puppyAge);
		return puppyAge;
		
	}
	
	public static void main(String[] args) {
		Puppy p = new Puppy();
		System.out.println(p.puppyAge);
		p.setAge(6);
		p.getAge();
		
	}
}

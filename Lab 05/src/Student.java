
public class Student {
	private Name name;
	private int age;
	
	public Student(Name name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Name getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return getName() + " " + age;
	}
	
	
	
}

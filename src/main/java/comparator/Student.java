package comparator;

public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	int id;
	String name;
	double percentage;

	Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

}

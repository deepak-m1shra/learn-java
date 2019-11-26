package comparator;

import java.util.Comparator;

public class PercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (int)(o2.percentage - o1.percentage);
	}

}

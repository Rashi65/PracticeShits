import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		// TODO Auto-generated method stub
		return std2.getAge()-std1.getAge();
	}

	
}

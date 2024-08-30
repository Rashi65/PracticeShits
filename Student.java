import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int rollNo;
	private int marks;
	private int age;

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", age=" + age + "]";
	}

	public Student(String name, int rollNo, int marks, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		return Integer.compare(std.getMarks(), this.getMarks());
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

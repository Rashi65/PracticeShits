import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String args[]) {
		Student s1 = new Student("Tom", 1, 90, 15);
		Student s2 = new Student("Tom", 1, 90, 15);
		Student s3 = new Student("Som", 3, 190, 34);
		Student s4 = new Student("Jon", 2, 4490, 18);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println("Size " + list.size());
		for (Student s : list)
			System.out.println(s);
		System.out.println("Students who got marks more than 90");
		List<Student> list2 = list.stream().filter(x -> x.getMarks() > 90).collect(Collectors.toList());
		System.out.println(list2.toString());
		System.out.println("Name of student who got marks > 90");
		List<String> names = list.stream().filter(x -> x.getMarks() > 90).map(e -> e.getName() + ":" + e.getMarks())
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("Highest Marks");
		int mark = list.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println(mark);
		System.out.println("Name having highest marks: ");
		Optional<String> nameOfTopStudent = list.stream().max(Comparator.comparingInt(Student::getMarks))
				.map(Student::getName);
		System.out.println(nameOfTopStudent.get());
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
		Collections.sort(list, new AgeComparator());
		System.out.println("Sorted List on age: " + list);
		Collections.sort(list, new NameComparator());
		System.out.println("Sorted List on name: " + list);
		System.out.println("Find non duplicate names: ");
		Set<Student> set = new HashSet<>();
		for (Student x : list) {
			set.add(x);
		}
		System.out.println(set.toString());
		List<Student> duplicates = findDuplicates(list);
		System.out.println(duplicates);
	}

	private static List<Student> findDuplicates(List<Student> students) {
		return students.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
	}
}

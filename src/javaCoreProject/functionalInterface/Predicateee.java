package javaCoreProject.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicateee {

	public static void main(String args[]) {

		List<String> students = Arrays.asList("Zahraa", "Abrar", "Alaa", "Howida");

		Predicate<String> st = (s) -> s.startsWith("A");

		students.forEach((student) -> {
			if (st.test(student)) {
				System.out.println(student);
			}
		});

	}

}

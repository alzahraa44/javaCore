package javaCoreProject.annotation;

import java.lang.reflect.*;
import java.lang.reflect.Method;

import javaCoreProject.annotation.exception.NoSuchClassException;

@Author(name = "Zahraa", age = 23)
public class Student {

	@Author(name = "Zahraa", age = 23)
	public String course;

	@Author(name = "Alaa", age = 16)
	public Student() {

	}

	@Author(name = "Abrar", age = 10)
	public static void meth() throws NoSuchClassException {
		try {

			Student st = new Student();

			Class<?> clas = st.getClass();
			Method metho = clas.getMethod("meth");
			Field filed = clas.getField("course");

			Author calssAnnotation = clas.getAnnotation(Author.class);
			Author filedAnnotation = filed.getAnnotation(Author.class);
			Author methoAnnotation = metho.getAnnotation(Author.class);

			System.out.println("this is an Annotation from calss name " + calssAnnotation.name() + "age is"
					+ calssAnnotation.age());
			System.out.println("this is an Annotation from Method name" + methoAnnotation.name() + "age is"
					+ methoAnnotation.age());
			System.out.println("this is an Annotation from Filed name" + filedAnnotation.name() + "age is"
					+ filedAnnotation.age());
		} catch (NoSuchMethodException met) {
			System.out.println("Method NOT Found");
		} catch (NoSuchFieldException fil) {
			System.out.println("field NOT Found");
		}

	}

	public static void main(String args[]) throws NoSuchClassException {
		meth();
	}

}

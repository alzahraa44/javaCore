package javaCoreProject.functionalInterface.rootofEquaction;

import java.util.function.Function;

public class Caluculate {
	public static void main(String args[]) {
		Coefficients input = new Coefficients(1.0, 3.0, -4.0);

		Function<Coefficients, Result> fun = (coefficients) -> {
			Result out = new Result();
			out.root1 = (-1 * coefficients.b
					+ Math.sqrt(coefficients.b * coefficients.b - 4 * coefficients.a * coefficients.c)) / 2
					* coefficients.a;
			out.root2 = (-1 * coefficients.b
					- Math.sqrt(coefficients.b * coefficients.b - 4 * coefficients.a * coefficients.c)) / 2
					* coefficients.a;
			return out;
		};
		Result result = fun.apply(input);
		System.out.println("The first Root is " + result.root1);
		System.out.println("The Second Root is " + result.root2);

	}
}

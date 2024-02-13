package javaCoreProject.functionalInterface.convertT;

import java.util.function.Function;

public class Temperature {
	public static void main(String args[]) {

		if (args.length != 0) {

			Integer temper = Integer.parseInt(args[0]);
			Function<Integer, Double> temperature = (c) -> (double) ((c * 9 / 5) + 32);
			System.out.println(temperature.apply(temper));

		} else
			System.out.println("Enter Temperature");
	}
}

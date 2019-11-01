import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i>10;

		System.out.println(predicate.test(5));
	}
}

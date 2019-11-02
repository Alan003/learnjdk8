import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		findNumber(list,item -> item %2 == 0);
		System.out.println("---------------");
		findNumber(list,item -> item % 2 !=0);
		System.out.println("---------------");
		findNumber(list,item -> item >5);
		System.out.println("---------------");
		findNumber(list,item -> item < 5);
		System.out.println("---------------");


		findNumber2(list,item -> item > 5,item -> item % 2 == 0);
		findNumber3(list,item -> item > 5,item -> item % 2 == 0);
		findNumber4(list,item -> item > 5,item -> item % 2 == 0);
	}

	private static void findNumber(List<Integer> list, Predicate<Integer> predicate){
		for (Integer i : list){
			if (predicate.test(i)){
				System.out.println(i);
			}
		}
	}

	private static void findNumber2(List<Integer> list,Predicate<Integer> predicate1,Predicate<Integer> predicate2){
		for (Integer i : list){
			if (predicate1.and(predicate2).test(i)){
				System.out.println(i);
			}
		}
	}

	private static void findNumber3(List<Integer> list,Predicate<Integer> predicate1,Predicate<Integer> predicate2){
		for (Integer i : list){
			if (predicate1.or(predicate2).test(i)){
				System.out.println(i);
			}
		}
	}

	private static void findNumber4(List<Integer> list,Predicate<Integer> predicate1,Predicate<Integer> predicate2){
		for (Integer i : list){
			if (predicate1.or(predicate2).negate().test(i)){
				System.out.println(i);
			}
		}
	}

}

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFuntionTest {
	public static void main(String[] args) {
		BiFuntionTest test = new BiFuntionTest();
//		System.out.println(test.compute(2,3,(v1,v2) -> v1 + v2));
		System.out.println(test.compute2(2,3,(v1,v2) -> v1 + v2,v3 -> v3 * v3));
	}

	public int compute(int a,int b, BiFunction<Integer,Integer,Integer> function){
		return function.apply(a,b);
	}

	public int compute2(int a, int b, BiFunction<Integer,Integer,Integer> function1, Function<Integer,Integer> function2){
		return function1.andThen(function2).apply(a,b);
	}
}

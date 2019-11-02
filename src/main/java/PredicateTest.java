import com.alibaba.fastjson.JSON;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i>10;

		System.out.println(predicate.test(5));

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("hello");

		hashSet.add("world");
		hashSet.add("1111");
		hashSet.add("hello");

		Object json = JSON.toJSON(hashSet);
		System.out.println(json);
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompator {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "abc", "world");

//		Collections.sort(list, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});

//		Collections.sort(list,(o1, o2) -> o2.compareTo(o1));

		Collections.sort(list,Comparator.reverseOrder());

		System.out.println(list);
	}
}

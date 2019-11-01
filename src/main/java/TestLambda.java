import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class TestLambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");

		list.forEach(i->System.out.println(i));

		System.out.println("---------------");

		list.stream().map(String::toUpperCase).forEach(i->System.out.println(i));

		Runnable run1 = ()->System.out.println("run1");

		new Thread(run1).start();

		System.out.println("*****"+run1.getClass());

		JFrame jFrame = new JFrame();

		JButton jButton = new JButton("点我");
		jButton.addActionListener(event->System.out.println("点击---------"));

		jFrame.add(jButton);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

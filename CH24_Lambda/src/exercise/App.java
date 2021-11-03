package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		list.removeIf (l-> l<0 || l>10);
		list.replaceAll(l-> l+100);
		list.forEach(l->System.out.println(l));
	}
}

package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// array와 linked 실행시간 비교
		List<Integer> arrayList = new ArrayList();
		List<Integer> linkedList = new LinkedList<>();
		//클래스를 여러개 가져올때 Ctrl+Shift+o
		
		long duration = timeOperation(arrayList);
		
		System.out.println("측정시간 : " + duration);
	}
	    private static long timeOperation(List<Integer> list) {
		//입력받은 리스트로 실행시간을 측정하여 리턴
	    	long start = System.currentTimeMillis();
	    	int total = 0;
	    	for(int i=0; i<100000; i++) {
	    		list.add(0,i);
	    	}
	    	return System.currentTimeMillis() - start;
	}

}

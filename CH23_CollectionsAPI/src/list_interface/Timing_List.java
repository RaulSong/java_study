package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// array�� linked ����ð� ��
		List<Integer> arrayList = new ArrayList();
		List<Integer> linkedList = new LinkedList<>();
		//Ŭ������ ������ �����ö� Ctrl+Shift+o
		
		long duration = timeOperation(arrayList);
		
		System.out.println("�����ð� : " + duration);
	}
	    private static long timeOperation(List<Integer> list) {
		//�Է¹��� ����Ʈ�� ����ð��� �����Ͽ� ����
	    	long start = System.currentTimeMillis();
	    	int total = 0;
	    	for(int i=0; i<100000; i++) {
	    		list.add(0,i);
	    	}
	    	return System.currentTimeMillis() - start;
	}

}

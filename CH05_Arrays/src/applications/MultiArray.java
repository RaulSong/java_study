package applications;

public class MultiArray {

	public static void main(String[] args) {
		// ���� �迭
		
		String[][] texts={
				{"�ϳ�","��","��"},
				{"��","�ټ�","����"},
				{"�ϰ�","����","��ȩ"},
		};
		
		for(int i=0; i<texts.length; i++) {
			//System.out.println(i);
			String[] innerArray=texts[i];
		
			for(int j=0; j<innerArray.length; j++) {
				System.out.printf("%s\t",innerArray[j]);
			}
			
			System.out.println();
		}
		
		
		
	}

}

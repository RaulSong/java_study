package applications;

public class StringArray2 {

	public static void main(String[] args) {
		// String�� ���� �ڷ���, ���� ������ �ּҰ��� ���´�
		
		String text=null; //null�� ���� ������ �ּҰ��� ����
		
		//text=new String("Hello!");
		text="Hello!";
		System.out.println(text);
		
		String[] texts=null;
		System.out.println(texts);
		
		texts=new String[3]; //3���� ���ڿ� �迭���� ����
		System.out.println(texts); //�迭�� �ּҰ��� ���
		
		texts[0]=new String("Hi!");
		texts[1]="�ȳ�?";
		texts[2]="�ȳ��ϼ���~";
		
		for(String word:texts) {
			System.out.println(word);
		}
				
	}

}

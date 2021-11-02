package example;

public class Split_String {

	public static void main(String[] args) {
		// ���ڿ�.split(" ") => ���ڿ��� ��������(space)�� �ɰ��� �迭�� ����
		String text1 = "Bukayo Saka says Arsenal��s new-look defence is ��doing wonders�� and that the team can be proud of the way they are not now making opponents work harder in the final third.";
		String text2 = "���������� ��ź�� ��ģ �ƽ����� ¥���� �¸��� ���ô�.�ƽ����� 30��(�ѱ��ð�) ���� ������ ŷ�Ŀ���Ÿ��򿡼� ���� 2021-2022 �����̾�� 10���� ������ �������� 2-0���� �¸��ߴ�. �̳� �¸��� �ŵ� �ƽ����� ���� 17������ ������ 5���� ���� �÷ȴ�.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //����ǥ����[]
		String[] words = text2.split("[^��-�R]+");
		
		for(String w : words) {
			if(w.length()<2) continue; //���縵 �ϳ�¥���� ����
			System.out.println(w.toLowerCase()); //�ҹ��ڷ� ���
		}
	
	}

}

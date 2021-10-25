package game.objects;

public enum GameObject {
	����, ����, ��;
	
	private int [][] comparision = {
			//���� ���� ��
			{ 0, -1, 1 },		//����
			{ 1, 0, -1 },		//����
			{ -1, 1, 0 }		//��
	};
	
	public int compare(GameObject ob) {
		return comparision[this.ordinal()][ob.ordinal()];
	}
	
}

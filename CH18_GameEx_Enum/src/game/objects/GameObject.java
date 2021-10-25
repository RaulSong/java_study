package game.objects;

public enum GameObject {
	가위, 바위, 보;
	
	private int [][] comparision = {
			//가위 바위 보
			{ 0, -1, 1 },		//가위
			{ 1, 0, -1 },		//바위
			{ -1, 1, 0 }		//보
	};
	
	public int compare(GameObject ob) {
		return comparision[this.ordinal()][ob.ordinal()];
	}
	
}

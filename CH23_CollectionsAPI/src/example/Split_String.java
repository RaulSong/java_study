package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열.split(" ") => 문자열을 공백으로(space)로 쪼개서 배열로 리턴
		String text1 = "Bukayo Saka says Arsenal’s new-look defence is “doing wonders” and that the team can be proud of the way they are not now making opponents work harder in the final third.";
		String text2 = "램스데일이 육탄방어를 펼친 아스날이 짜릿한 승리를 맛봤다.아스날은 30일(한국시간) 영국 레스터 킹파워스타디움에서 열린 2021-2022 프리미어리그 10라운드 레스터 원정에서 2-0으로 승리했다. 이날 승리를 거둔 아스날은 승점 17점으로 순위롤 5위로 끌어 올렸다.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //정규표현식[]
		String[] words = text2.split("[^가-힣]+");
		
		for(String w : words) {
			if(w.length()<2) continue; //스펠링 하나짜리는 빠짐
			System.out.println(w.toLowerCase()); //소문자로 출력
		}
	
	}

}

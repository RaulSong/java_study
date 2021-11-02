package example;

public class Split_String {

	public static void main(String[] args) {
		// ¹®ÀÚ¿­.split(" ") => ¹®ÀÚ¿­À» °ø¹éÀ¸·Î(space)·Î ÂÉ°³¼­ ¹è¿­·Î ¸®ÅÏ
		String text1 = "Bukayo Saka says Arsenal¡¯s new-look defence is ¡°doing wonders¡± and that the team can be proud of the way they are not now making opponents work harder in the final third.";
		String text2 = "·¥½ºµ¥ÀÏÀÌ À°Åº¹æ¾î¸¦ ÆîÄ£ ¾Æ½º³¯ÀÌ Â¥¸´ÇÑ ½Â¸®¸¦ ¸ÀºÃ´Ù.¾Æ½º³¯Àº 30ÀÏ(ÇÑ±¹½Ã°£) ¿µ±¹ ·¹½ºÅÍ Å·ÆÄ¿ö½ºÅ¸µð¿ò¿¡¼­ ¿­¸° 2021-2022 ÇÁ¸®¹Ì¾î¸®±× 10¶ó¿îµå ·¹½ºÅÍ ¿øÁ¤¿¡¼­ 2-0À¸·Î ½Â¸®Çß´Ù. ÀÌ³¯ ½Â¸®¸¦ °ÅµÐ ¾Æ½º³¯Àº ½ÂÁ¡ 17Á¡À¸·Î ¼øÀ§·Ñ 5À§·Î ²ø¾î ¿Ã·È´Ù.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //Á¤±ÔÇ¥Çö½Ä[]
		String[] words = text2.split("[^°¡-ÆR]+");
		
		for(String w : words) {
			if(w.length()<2) continue; //½ºÆç¸µ ÇÏ³ªÂ¥¸®´Â ºüÁü
			System.out.println(w.toLowerCase()); //¼Ò¹®ÀÚ·Î Ãâ·Â
		}
	
	}

}

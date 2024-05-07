package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("»õ¿ì±ø");
		set.add("°í·¡¹ä");
		set.add("²É°Ô¶û");
		set.add("¸Àµ¿»ê");
		set.add("¿ÀÂ¡¾î¶¥Äá");
		set.add("¾Ë»õ¿ìÄ¨");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");

		System.out.println(set);//[°í·¡¹ä, ¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û]
			//setÀº Áßº¹µÇ´Â °ªÀº °è¼Ó Ãß°¡ÇÏÁö ¾ÊÀ¸¹Ç·Î
			//set[] = [°í·¡¹ä, ¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û]
		
		//size() - set[]ÀÇ size È®ÀÎ
		System.out.println(set.size());//6
		
		//contains() - ¸Àµ¿»êÀÌ Á¸ÀçÇÏ´ÂÁö È®ÀÎ
		System.out.println(set.contains("¸Àµ¿»ê"));//true
			//set[] = [°í·¡¹ä, ¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û] ÀÌ¹Ç·Î
			//¸Àµ¿»êÀÌ Á¸ÀçÇÏ¹Ç·Î true
		
		//remove() - °í·¡¹ä Á¦°Å
		set.remove("°í·¡¹ä");//[¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û]
		System.out.println(set);
			//set[] = [¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û]
		
		//isEmpty() - µ¥ÀÌÅÍ°¡ ¸ðµÎ Á¦°ÅµÇ¾ú´ÂÁö È®ÀÎ
		System.out.println(set.isEmpty());//false
			//set[] = [¸Àµ¿»ê, ¿ÀÂ¡¾î¶¥Äá, »õ¿ì±ø, ¾Ë»õ¿ìÄ¨, ²É°Ô¶û] ÀÌ¹Ç·Î
			//setÀÌ ºñ¾îÀÖÁö ¾ÊÀ¸¹Ç·Î false
	}
}
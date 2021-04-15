package 크롤링;


import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://www.naver.com");
		//Jsoup.connect("http://naver.com").get(); .이 계속 있는 코드 : chain식 코드
		
		//2. 연결한 사이트에 html문서를 받아오기.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("a.nav");
		System.out.println(anav.size());
		
		for (Element e : anav) {
			System.out.println(e.text());
		}
	}

}

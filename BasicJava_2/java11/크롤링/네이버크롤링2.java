package 크롤링;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/virtualestimate/?controller=estimateMain&methods=index&marketPlaceSeq=16&logger_kw=esti_shop_top");
		// Jsoup.connect("http://naver.com").get(); .이 계속 있는 코드 : chain식 코드

		// 2. 연결한 사이트에 html문서를 받아오기.
		Document doc = con.get();
		// System.out.println(doc);
		Elements anav = doc.select("a"); //태그가 다음 줄으면 한칸 스페이스바
																   //태그가 같은 꺽쇄 안에 있으면 .찍어줘야한다.
																   //바로 밑 태그 : >

		for (int i = 0; i < anav.size(); i++) {
			String href = anav.get(i).text();
			System.out.println(href);
		}
			
		
		//Elements imgs = doc.getElementsByTag("img"); //img 크롤링
		//for (int j = 0; j < imgs.size(); j++) {
		//	String src = imgs.get(j).attr("src");
		//	System.out.println(src);
		//}

	}

}

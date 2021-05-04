package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링저장연습다시2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/main/?controller=goods&methods=blog&billingInternalProductSeq=11308551&productRegisterAreaGroupSeq=20&serviceSectionSeq=594");
		Document doc = con.get();

		Elements anav = doc.select("th.s_tit");
		Elements anav2 = doc.select("td.s_info");
		
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text() + " : " + anav2.get(i).text());
		}	
	}
}

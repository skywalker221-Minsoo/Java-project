package 크롤링;

import java.io.FileWriter;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링저장연습다시 {

	public static void crawling() throws Exception {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/weekdayList.nhn?week=fri");

		Document doc = con.get();

		Elements anav = doc.select("dl dt a");
		Elements anav2 = doc.select("div.rating_type");
		Elements anav3 = doc.select("dd.desc");
		
		//String sum = "";
		FileWriter f = new FileWriter("c:/data/웹툰.txt");
		for (int i = 0; i < anav2.size(); i++) {
			f.write(anav.get(i+3).text() + "  작가 " + 
					anav3.get(i+3).text() + " "
					+ anav2.get(i).text() + "\n");
		}	
		f.close();
	}

}

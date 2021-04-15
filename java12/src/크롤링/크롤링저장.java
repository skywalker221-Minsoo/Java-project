package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링저장 {

	public static void main(String[] args) throws Exception {
		
		Document doc = null;
		Elements elemList = new Elements();
		String URL = "https://comic.naver.com/webtoon/weekday.nhn";
		String[] dateArr = {"h4.mon", "h4.tue", "h4.wed", "h4.thu", "h4.fri", "h4.sat", "h4.sun"};
		
		try {
			Connection connection = Jsoup.connect(URL);

			doc = connection.get();
			elemList = doc.select(".col_inner");
			FileWriter f = new FileWriter("c:/data/요일별 웹툰.txt");

			if (elemList.size() > 0) {

				for (int i = 0; i < elemList.size(); i++) {
					Elements elems = elemList.get(i).children();

					if (elems.size() > 0) {

						for (int j = 0; j < dateArr.length; j++) {
							Elements elemTitle = new Elements();
							Elements elemUl = new Elements();
							elemTitle = elems.select(dateArr[j]);

							if (elemTitle != null && !elemTitle.isEmpty()) {
								System.out.println("----------------");
								System.out.println(elemTitle.text());
								System.out.println("----------------");

								elemUl = elems.select("ul > li");

								if (elemUl.size() > 0) {

									for (int k = 1; k < elemUl.size(); k++) {
										Elements elemLi = elemUl.get(k).children();
										System.out.println(k + ". " + elemLi.text());
										f.write(elemTitle.text() + "\t\t" + elemLi.text() + "\n");
									}
								}
							}
						}
					}
				}
			} f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

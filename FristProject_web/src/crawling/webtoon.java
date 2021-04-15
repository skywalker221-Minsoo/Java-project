package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.Connection;

public class webtoon {

	public static void main(String[] args) {

		select selectSql = new select();
		insert insertSql = new insert();

		Document doc = null;
		Elements elemList = new Elements();
		String URL = "https://comic.naver.com/webtoon/weekday.nhn";
		String[] dateArr = {"h4.mon", "h4.tue", "h4.wed", "h4.thu", "h4.fri", "h4.sat", "h4.sun"};
		
		try {
			Connection connection = Jsoup.connect(URL)
					.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.146 Safari/537.36")
					.header("Accept", "text/html")
					.header("Accept-Encoding", "gzip,deflate")
					.header("Accept-Language", "it-IT, en;q=0.8,en-US;q=0.6,de;q=0.4,it;q=0.2,es;q=0.2")
					.header("Connection", "keep-alive")
					.ignoreContentType(true)
					.timeout(30000);
			doc = connection.get();
			elemList = doc.select(".col_inner");

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

									for (int k = 0; k < elemUl.size(); k++) {
										Elements elemLi = elemUl.get(k).children();

										if (selectSql.selectQuery(elemLi.text()) < 1) {
											Elements elemHref = elemLi.select(".thumb > a");
											Elements elemImg = elemLi.select(".thumb > a > img");

											System.out.println(elemLi.text());
											System.out.println(elemImg.attr("src"));
											System.out.println("------------------");

											insertSql.insertQuery(j, elemLi.text(), elemHref.attr("href"), elemImg.attr("src"));
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
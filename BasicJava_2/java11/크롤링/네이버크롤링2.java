package ũ�Ѹ�;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/virtualestimate/?controller=estimateMain&methods=index&marketPlaceSeq=16&logger_kw=esti_shop_top");
		// Jsoup.connect("http://naver.com").get(); .�� ��� �ִ� �ڵ� : chain�� �ڵ�

		// 2. ������ ����Ʈ�� html������ �޾ƿ���.
		Document doc = con.get();
		// System.out.println(doc);
		Elements anav = doc.select("a"); //�±װ� ���� ������ ��ĭ �����̽���
																   //�±װ� ���� ���� �ȿ� ������ .�������Ѵ�.
																   //�ٷ� �� �±� : >

		for (int i = 0; i < anav.size(); i++) {
			String href = anav.get(i).text();
			System.out.println(href);
		}
			
		
		//Elements imgs = doc.getElementsByTag("img"); //img ũ�Ѹ�
		//for (int j = 0; j < imgs.size(); j++) {
		//	String src = imgs.get(j).attr("src");
		//	System.out.println(src);
		//}

	}

}

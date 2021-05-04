package 생성자;

//�쟾�떖�븷 �븣 媛� 媛믩뱾�쓣 �뵲濡� 蹂대궡�뒗 寃껊낫�떎
//媛�諛⑹쓣 �븯�굹 留뚮뱾�뼱�꽌 
//媛믪쓣 �꽔�� �떎�쓬�뿉 �쟾�떖�븯�뒗 寃껋씠 �뜑 �슚�쑉�쟻/�렪�븯�떎.
public class MemberVO {
	//媛�諛⑹븞�뿉 蹂��닔�뱾濡� 怨듦컙�쓣 留뚮뱾�뼱�몦�떎.
	String id;
	String pw;
	String name;
	String tel;
	
	//媛믪쓣 �꽔怨� 類꾨븣�뒗 蹂��닔 �븯�굹�뵫 湲곕뒫�쓣 泥섎━�븳�떎.
	//媛� 蹂��닔留덈떎 �꽔�뒗 湲곕뒫, 爰쇰궡�뒗 湲곕뒫�씠 �븘�슂�븯�떎.
	//湲곕뒫�� 硫붿꽌�뱶濡� 援ы쁽
	//setters, getters
	//source硫붾돱�뿉�꽌 �옄�룞 �깮�꽦
	public void setId(String id) {
		this.id = id;
		//this: �씠 �겢�옒�뒪=>MemberVO
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}

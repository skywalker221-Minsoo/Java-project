/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-04-13 07:21:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class danawa_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1615452824182L));
    _jspx_dependants.put("jar:file:/C:/Users/User/PycharmProjects/javaProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SecondProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!-- JSTL을 사용하여 arrayList를 사용하는 방식으로 요구에 충족하는 부품들의 모든 데이터를 불러온다. -->\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/main_exterior.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<style>\r\n");
      out.write(".center{ /* .클래스명 : 'center' 이름을 가진 클래스 적용 */\r\n");
      out.write("\ttext-align: center; \r\n");
      out.write("\tfont-size: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#top3 {\r\n");
      out.write("\twidth: 240px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tbackground: gray;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttop: 5px;\r\n");
      out.write("\tright: 0px;\r\n");
      out.write("\tposition: fixed; /* 위치 고정. 다른 내용이 움직여도 모니터 내 위치 고정 */\r\n");
      out.write("\tborder-radius: 0px 0px 50px 30px; /* 장바구니 모서리 둥근정도 설정 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#feedback { font-size: 1em; } /* 1em : font 단위, 기본 font 크기. 글자 크기 산정방식 : 상위 클래스 글자 크기 * n(em) = 해당 클래스 font의 크기\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      여기선  1em이므로 상위 클래스의 글자 크기(기본 크기) * 1(em) = 기본 font 크기 */\r\n");
      out.write("  #selectable .ui-selecting { background: #FECA40; }\r\n");
      out.write("  #selectable .ui-selected { background: #F39814; color: white; }\r\n");
      out.write("  #selectable { list-style-type: none; margin: 0; padding: 0; width: 100%; }\r\n");
      out.write("  #selectable li { margin: 0px; padding: 0.4em; font-size: 1em; height: 18px; }\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var totalData = 20; //각 부품별 데이터베이스에 저장된 자료의 갯수\r\n");
      out.write("var dataPerPage = 5; //한 페이지당 표시되는 물품 수\r\n");
      out.write("var pageCount = 4; //총 페이지수를 미리 지정해 두어 정해진 총 데이터 갯수만큼 데이터가 표시되도록 함.\r\n");
      out.write("\r\n");
      out.write("function paging(totalData, dataPerPage, pageCount, currentPage) {\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(\"currentPage : \" + currentPage);\r\n");
      out.write("\t\r\n");
      out.write("\tvar totalPage = Math.ceil(totalData/dataPerPage); //전체 페이지 : 20 / 5 = 총 4페이지\r\n");
      out.write("\t//페이지 단위 : 현재 페이지/총 페이지 나눗셈으로 각 페이지별 표시되는 데이터의 순번 지정할수 있도록 함.\r\n");
      out.write("\t//반올림 함수를 이용하여 만약 최대로 저장할수 있는 자료의 갯수를 채우지 못하더라도 갯수가 모자란 페이지가 표시할 수 있도록 함.\r\n");
      out.write("\tvar pageGroup = Math.ceil(currentPage/pageCount);\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(\"pageGroup : \" + pageGroup);\r\n");
      out.write("\t\r\n");
      out.write("\tvar last = pageGroup * pageCount; //화면에 보여질 페이지 마지막 번호\r\n");
      out.write("\tif (last > totalPage) //마지막 페이지까지 도달하면 연장화살표가 표시되지 않도록 함.\r\n");
      out.write("\t\tlast = totalPage;\r\n");
      out.write("\tvar next = last + 1; //다음페이지\r\n");
      out.write("\tvar first = last - (pageCount - 1); //화면에 보여질 페이지 번호\r\n");
      out.write("\tvar prev = first - 1; //이전 페이지\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(\"last : \" + last);\r\n");
      out.write("\tconsole.log(\"first : \" + first);\r\n");
      out.write("\tconsole.log(\"next : \" + next);\r\n");
      out.write("\tconsole.log(\"prev : \" + prev);\r\n");
      out.write("\t\r\n");
      out.write("\tvar $pingingView = $(\"#paging\");\r\n");
      out.write("\tvar html = \"\"; //페이지를 넘겨주기 위한 주소를 문자열 초기화\r\n");
      out.write("\t\r\n");
      out.write("\tif (prev > 0)\r\n");
      out.write("\t\t//브라우저에 표시된 페이징 숫자를 id=에 넣어주어 화면별 지정된 데이터들을 가져올 수 있게 함.\r\n");
      out.write("\t\thtml += \"<a href=# id='prev'><</a> \";\r\n");
      out.write("\t\t\r\n");
      out.write("\tfor (var i = first; i <= last; i++) {\r\n");
      out.write("\t\t//페이지 나열.\r\n");
      out.write("\t\thtml += \"<a href='#' id=\" + i + \">\" + i + \"</a> \";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif (last < totalPage)\r\n");
      out.write("\t\t//화면에 표시된 페이지 이후의 페이지가 있다면 화살표 모양을 만들어 주어 이후 페이지를 볼 수 있게 함.\r\n");
      out.write("\t\thtml += \"<a href=# id='next'>></a>\";\r\n");
      out.write("\r\n");
      out.write("\t$(\"#paging\").html(html); //페이지 정보를 브라우저에 구현 \r\n");
      out.write("\t$(\"#paging a\").css(\"color\", \"white\"); //브라우저에 표시된 화면의 스타일.\r\n");
      out.write("\t//페이지를 클릭했을 때, 해당 페이지가 눌려있다는 것을 인지하기 위핸 표시.\r\n");
      out.write("\t$(\"#paging a#\" + currentPage).css({\"text-decoration\":\"none\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \"color\":\"yellow\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \"font-weight\":\"bold\"});\r\n");
      out.write("\t\r\n");
      out.write("\t//첫 화면에서 페이지가 표시되는데, 첫 화면의 페이지에서 페이지 번호들을 클릭했을 경우 \r\n");
      out.write("\t$(\"#paging a\").click(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $item = $(this); //페이지를 클릭하면\r\n");
      out.write("\t\tvar $id = $item.attr(\"id\"); //페이지의 번호가 id= 에 들어감.\r\n");
      out.write("\t\tvar selectedPage = $item.text(); //해당 페이지의 text만 가져옴.(ex) 1, 2, 3, ..)\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//페이지를 각각 클릭했을 때.\r\n");
      out.write("\t\tif($id == \"next\")\tselectPage = next;\r\n");
      out.write("\t\tif($id == \"prev\")\tselectPage = prev;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//첫 화면의 페이지를 눌렀을 때 물건들을 불러오도록 함.\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"cpu\", //views 폴더의 cpu.jsp로 가서 cpu의 정보들을 db에서 꺼내어 db에 저장된 순서대로 보여줌.\r\n");
      out.write("\t\t\tdata: {\r\n");
      out.write("\t\t\t\tid: selectedPage //페이지를 눌렀을 때 페이지의 숫자가 문자열로 id= 에 들어감.\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess: function(result) { //result : url에서 받아온 값\r\n");
      out.write("\t\t\t\t$(result).each(function() { //비동기식 연결이 성공했을 때, 각 부품 마다의 정보를 화면에 구현하도록 함.\r\n");
      out.write("\t\t\t\t\t$('#div').empty() //화면에 비동기식으로 바뀌는 부분만을 깨끗하게 보여주기 위해 div 속성에 있는 값들을 모두 제거해준다.\r\n");
      out.write("\t\t\t\t\t$('#ui-widget-content').html(result) //id가 ui-widget-content 태그로 감싸진 정보만을 계속해서 바꾸면서 출력해준다.\r\n");
      out.write("\t\t\t\t\t$('#document').html(result) //페이징이 자연스러워 지도록 브라우저에 표시.\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('all3연결 실패!')\r\n");
      out.write("\t\t\t}           \t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tpaging(totalData, dataPerPage, pageCount, selectedPage);\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(\"document\").ready(function() {\r\n");
      out.write("\tpaging(totalData, dataPerPage, pageCount, 1);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//제품들이 브라우저에 표시될 때 적용될 스타일 함수\r\n");
      out.write("$(function() {\r\n");
      out.write("    $( \"#selectable\" ).selectable();\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//각 버튼(CPU, 메모리, 메인보드, 그래픽카드, PC 추천)을 눌렀을 때 ajax방식을 활용한 구현정보 변경.\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$('#b1').click(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"cpu_button\", //각 버튼마다 컨트롤러에서 맵핑되어 일정 연산을 수행하고 views 아래에 대응하는 jsp파일을 모두 만들어줌.\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t$('#div').empty() //원하는 부분만 교체하기 위해 해당되는 태그의 모든 내용을 지워준다.\r\n");
      out.write("\t\t\t\t//이후 해당하는 태그 안에 들어있는 내용만을 (url).jsp에 넣어두고 해당되는 내용만 불러내어 페이지의 원하는 교체 작업만 해줄 수 있게 해줌.\r\n");
      out.write("\t\t\t\t$('#ui-widget-content').html(result)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('연결 실패.') //에러가 났을 때 인지할 수 있도록.\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t$('#b2').click(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"memory_button\",\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t$('#div').empty()\r\n");
      out.write("\t\t\t\t$('#ui-widget-content').html(result)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('연결 실패.')\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t$('#b3').click(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"mainboard_button\",\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t$('#div').empty()\r\n");
      out.write("\t\t\t\t$('#ui-widget-content').html(result)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('연결 실패.')\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t$('#b4').click(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"graphic_button\",\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t$('#div').empty()\r\n");
      out.write("\t\t\t\t$('#ui-widget-content').html(result)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('연결 실패.')\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t$('#b5').click(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"random\",\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t$('#div').empty()\r\n");
      out.write("\t\t\t\t$('#ui-widget-recommand').html(result)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function() {\r\n");
      out.write("\t\t\t\talert('연결 실패.')\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"total\"> <!-- 상단 메뉴는 내부 내용이 바뀌어도 고정되게끔 한다. -->\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<!-- 사이트 이름 및 검색 탭 -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"top2\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top2.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" \t\t<div id=\"top3\">\r\n");
      out.write("\t\t\t<!-- 개인정보 및 고객센터 탭 -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top3.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<!-- 가장 좌측에 있는 기능. 나머지 2개의 기능도 순차적으로 오른쪽으로 붙는다. -->\r\n");
      out.write("\t\t\t<li style=\"background: green; margin:0 0 0 100px\">\r\n");
      out.write("\t\t\t\t<div class=\"left\" style=\"border:solid 5px #333333; width: 600px; height: 2000px\">\r\n");
      out.write("\t\t\t\t\t<dl class=\"group_1_list\">\r\n");
      out.write("\t\t\t\t\t\t<ol id=\"selectable\"> <!-- 제품 정보가 표시될 때 글자 및 구현될 공간에 스타일 적용 -->\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"ui-widget-recommand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font size=\"30\" color=\"brown\">PC 추천</font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li style=\"background: red; margin:0 auto\">\r\n");
      out.write("\t\t\t\t<div class=\"middle\" style=\"border:solid 5px #333333; width: 600px; height: 2000px\">\r\n");
      out.write("\t\t\t\t\t<dl class=\"group_0_list\">\r\n");
      out.write("\t\t\t\t\t\t<ol id=\"selectable\">\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"ui-widget-content\"><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- JSTL 사용. selectList를 이용하여 DB에서 가져온 데이터를 모두 화면에 출력. -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<div id=\"paging\"></div><!-- 페이징 적용, 적당한 위치에 두어 가독성을 높임. -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li style=\"background: blue; margin:0 auto\">\r\n");
      out.write("\t\t\t\t<div class=\"right\" style=\"border:solid 5px #333333; width: 300px; height: 2000px\">\r\n");
      out.write("\t\t\t\t\t<dl class=\"group_1_list\">\r\n");
      out.write("\t\t\t\t\t\t<ol id=\"selectable\">\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"ui-widget-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 각 목록별 버튼, 버튼을 누르면 해당 부품의 목록이 브라우저에 출력된다. -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"b1\" class=\"w3-button w3-black w3-round-xlarge\" style=\"float:center;\">CPU</button><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"b2\" class=\"w3-button w3-black w3-round-xlarge\" style=\"float:center;\">메모리</button><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"b3\" class=\"w3-button w3-black w3-round-xlarge\" style=\"float:center;\">메인보드</button><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"b4\" class=\"w3-button w3-black w3-round-xlarge\" style=\"float:center;\">그래픽카드</button><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"b5\" class=\"w3-button w3-black w3-round-xlarge\" style=\"float:center;\">추천 클릭</button><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/danawa_main.jsp(241,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("vo");
      // /WEB-INF/views/danawa_main.jsp(241,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/danawa_main.jsp(241,8) '${list_CPU}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list_CPU}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<!-- DB에 저장된 컬럼명 --> \r\n");
            out.write("\t\t\t\t\t\t\t\t<img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><br><br>\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.company}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/<br>\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.indate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.sort}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.socket}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.generation}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/<br>\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.birth}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.chipline}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.pcie}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.maxpcie}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.fee}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("원<br><br>\r\n");
            out.write("\t\t\t\t\t\t\t\t<!-- 장바구니에 회원id, 물품명, 물품 가격이 받아온다. --> \r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"add2?cart_image=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&\r\n");
            out.write("\t\t                        \tproduct_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&\r\n");
            out.write("\t\t                        \tcart_price=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.fee}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&\r\n");
            out.write("\t\t                        \tuser_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user_Id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&\r\n");
            out.write("\t\t                        \tcart_count=1\" class=\"w3-button w3-black w3-round-xlarge\">장바구니</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"cpu_page\" class=\"w3-button w3-black w3-round-xlarge\">상세페이지</a><hr color=\"green\" width=\"500px\"><br>\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

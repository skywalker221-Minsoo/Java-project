package 네트워크;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP날짜시간서버 {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(9001);	//새로운 서버를 만들고 포트번호 생성.
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		int count = 0;		//클라이언트 총 갯수를 세어보려함.
		try {				//서버에 클라이언트를 연결하는 네트워크 이므로 예외처리를 해주어 잘 작동하게 한다.
			while (true) {
				Socket soc = server.accept();	//서버를 열여준다.

				count++;
				System.out.println("서버가 " + count + "개의 클라이언트 요청을 승인함.");
				try {
					PrintWriter print = new PrintWriter(soc.getOutputStream(), true);
					//바이트 스트림 단위로 문자를 출력하게 해준다. 즉, 현재시간을 받아온 문자열을 출력할 수 있도록 해주는 것.
					//여기 생성자에는 FileNotFoundException예외를 발생시키므로 예외처리가 필요하다.
					print.println(new Date().toString());
					//클라이언트마다 현재시간을 가져와 문자열로 변환시켜준다. 그리고 출력.
				}finally {
					soc.close();
					//모든 클라이언트가 날짜를 받아 문자열로 출력이 다 되면 소켓을 닫아준다.
				}
			}
		}finally {
			server.close();	//소켓이 닫아지면 서버도 닫는다.
		}
	}
}

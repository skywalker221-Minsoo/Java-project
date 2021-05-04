package 네트워크;

import java.net.ServerSocket;
import java.io.IOException;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		//어차피 내 컴퓨터에서 하니까 IP는 안써줘도 되고 포트 번호만 써도 된다.
		
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		while (true) {
			server.accept();
			System.out.println("서버가 클라이언트의 요청을 승인함.");
		}

	}

}

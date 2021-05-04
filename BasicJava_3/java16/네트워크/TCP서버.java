package 네트워크;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		//어차피 내 컴퓨터에서 하니까 IP는 안써줘도 되고 포트 번호만 써도 된다.
		
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		int count = 0;

		while (true) {
			Socket socket = server.accept();
			//System.out.println("서버가 클라이언트의 요청을 승인함.");
			count++;
			
			System.out.println("서버가 " + count + "개의 클라이언트 요청을 승인함.");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String data = "I am a java programmer!!";
			out.print(data);
			out.close();
			socket.close();
			
		}
		
	}

}

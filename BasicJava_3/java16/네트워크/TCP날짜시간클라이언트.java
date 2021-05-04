package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCP날짜시간클라이언트 {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 500; i++) {					//클라이언트가 500명인 것으로 가정. 
			Socket soc = new Socket("localhost", 9001);	//클라이언트가 서버에 접속할 수 있도록 해준다.
			System.out.println( i + "번 클라이언트가 9001번 포트 서버에 연결을 요청함.");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			//문자들을 줄단위로 가져와 문자열로 인식하여 읽어줄 수 있도록 한다.
			String res = input.readLine();
			//가져온 문자열을 줄별로 읽어들일 수 있도록 한다.
			System.out.println(i + "번 클라이언트 날짜 시간 : " + res);
		}
	}
}


package ��Ʈ��ũ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPŬ���̾�Ʈ3 {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 1200; i++) {
			Socket socket = new Socket("localhost", 9000);
			System.out.println( i + "�� Ŭ���̾�Ʈ�� 9000�� ��Ʈ ������ ������ ��û��.");
			
			//BufferedReader Ŭ������ ���ڵ��� �ٴ����� ������ �ͼ� ó���� �� �ִ� Ŭ����
			//Reader, Writer Ŭ������ ���ڵ鸸 ó���ϴ� Ŭ����
			
			//1. 1byte ������ ����. ���� �������� �ν��� �ȵ� ����. �ν��ϱ����ؼ��� ���� ����������Ѵ�.
			//InputStream input = socket.getInputStream();
			
			//2. 1byte�� ó���Ǵ� ���� �������� �ν��� �ȵ� ���������¸� 2byte ���ڷ� �νĽ����ִ� Ŭ����
			//InputStreamReader reader = new InputStreamReader(input); //���ڷ� �ν��ϱ� �����Ѵ�.
			
			//3. 2byte ����ó���� ���ڵ��� �ٴ����� �о�� �� �ִ� Ŭ����
			//BufferedReader buffer = new BufferedReader(reader);
		
			//4. �ѹ��� ���ڸ� �̷��� ����.
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//buffer: �ӽ� ������
			String data = buffer2.readLine();
			System.out.println("�����κ��� ���� ������ >> " + data);
		}
		
	}

}

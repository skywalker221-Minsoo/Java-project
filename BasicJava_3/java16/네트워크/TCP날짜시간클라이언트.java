package ��Ʈ��ũ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCP��¥�ð�Ŭ���̾�Ʈ {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 500; i++) {					//Ŭ���̾�Ʈ�� 500���� ������ ����. 
			Socket soc = new Socket("localhost", 9001);	//Ŭ���̾�Ʈ�� ������ ������ �� �ֵ��� ���ش�.
			System.out.println( i + "�� Ŭ���̾�Ʈ�� 9001�� ��Ʈ ������ ������ ��û��.");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			//���ڵ��� �ٴ����� ������ ���ڿ��� �ν��Ͽ� �о��� �� �ֵ��� �Ѵ�.
			String res = input.readLine();
			//������ ���ڿ��� �ٺ��� �о���� �� �ֵ��� �Ѵ�.
			System.out.println(i + "�� Ŭ���̾�Ʈ ��¥ �ð� : " + res);
		}
	}
}


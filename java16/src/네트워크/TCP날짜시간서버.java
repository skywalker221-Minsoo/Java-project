package ��Ʈ��ũ;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP��¥�ð����� {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(9001);	//���ο� ������ ����� ��Ʈ��ȣ ����.
		System.out.println("���� ���� ���۵�.");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
		int count = 0;		//Ŭ���̾�Ʈ �� ������ �������.
		try {				//������ Ŭ���̾�Ʈ�� �����ϴ� ��Ʈ��ũ �̹Ƿ� ����ó���� ���־� �� �۵��ϰ� �Ѵ�.
			while (true) {
				Socket soc = server.accept();	//������ �����ش�.

				count++;
				System.out.println("������ " + count + "���� Ŭ���̾�Ʈ ��û�� ������.");
				try {
					PrintWriter print = new PrintWriter(soc.getOutputStream(), true);
					//����Ʈ ��Ʈ�� ������ ���ڸ� ����ϰ� ���ش�. ��, ����ð��� �޾ƿ� ���ڿ��� ����� �� �ֵ��� ���ִ� ��.
					//���� �����ڿ��� FileNotFoundException���ܸ� �߻���Ű�Ƿ� ����ó���� �ʿ��ϴ�.
					print.println(new Date().toString());
					//Ŭ���̾�Ʈ���� ����ð��� ������ ���ڿ��� ��ȯ�����ش�. �׸��� ���.
				}finally {
					soc.close();
					//��� Ŭ���̾�Ʈ�� ��¥�� �޾� ���ڿ��� ����� �� �Ǹ� ������ �ݾ��ش�.
				}
			}
		}finally {
			server.close();	//������ �ݾ����� ������ �ݴ´�.
		}
	}
}

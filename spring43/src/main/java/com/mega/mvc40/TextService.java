package com.mega.mvc40;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TextService {
	
	public int text(String tel) {
		//������ �� 6�ڸ� ����� controller���� num2 ����
		Random r = new Random();
		int num2 = r.nextInt(900000) + 100000;
		return num2;
	}
}

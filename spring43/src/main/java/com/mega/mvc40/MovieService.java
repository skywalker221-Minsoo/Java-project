package com.mega.mvc40;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MovieService {
	
	public int fee(String fee) {
		int pay = Integer.parseInt(fee);
		return pay;
	}
	public String title(String title) {
		String subject = title;
		return subject;
	}
}

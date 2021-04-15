package com.mega.mvc37.test;

public class Test1 {

	public static void main(String[] args) {
		int p = 2, n = 3;
		while (true) {
			double t = Math.sqrt(n);
			int m = (int)t;
			for (int i = 2; i <= m; i++) {
				int r = n % i;
				System.out.println(r);
				if (r == 0) break;
				if (i == m) p = n;
			}
			n++;
			if (n > 100) break;
		}
		System.out.println(p);
	}
}

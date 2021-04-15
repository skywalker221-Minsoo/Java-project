package test;

import java.util.ArrayList;
import DB.MovieDB2;
import DB.MovieVO;

public class tes2t {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	        MovieDB2 db = new MovieDB2();
	        ArrayList<MovieVO> list2 = db.list();
	        
			for (int i = 0; i < list2.size(); i++) {
				MovieVO bag = list2.get(i);
				double rank = Double.parseDouble(bag.getRank());
				System.out.println(rank);
			}
			
		}
	}

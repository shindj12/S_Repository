package aa;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class aa {
	private static final int MAX = 100;
	public static ArrayList<Integer> aa = new ArrayList<Integer>();
	public static int[] a = new int[MAX];

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		// Random random = new Random();
		// a.add(random.nextInt(MAX+1));

		for (int i = 1; i <= MAX; i++)
			aa.add(i);
		Collections.shuffle(aa);
		for (int j = 0; j < MAX; j++) {
			a[j] = aa.get(j);
			System.out.println(a[j]);

		}
		

		// bs(9, a.size(), 1);

		return;
	}
	
	public static void ss(int[] arr) {
		int minVal;
		
		for(int r = 0 ; r <= MAX ; r++) {
			
		}
		
	}

}

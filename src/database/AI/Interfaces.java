package database.AI;

import java.io.IOException;
import java.util.ArrayList;

public class Interfaces {

	public static boolean predict(int zone, int num) {
		TestData tb = new TestData();
		ArrayList<ArrayList<String>> datas = null;
		ArrayList<String> testT = null;
		NaiveTest bayes = new NaiveTest();
		try {
			datas = tb.readData();
			testT = tb.readTestData(zone, num);

			String c = bayes.predictClass(datas, testT);
			if (c.equals("no"))
				return false;
			else
				return true;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println(predict(0, 3));
	}

}

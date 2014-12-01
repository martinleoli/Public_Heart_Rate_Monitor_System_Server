package database.AI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TestData {

	// Reading test data
	public ArrayList<String> readTestData() throws IOException {
		ArrayList<String> candAttr = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String str = "";
		while (!(str = reader.readLine()).equals("")) {
			StringTokenizer tokenizer = new StringTokenizer(str);
			while (tokenizer.hasMoreTokens()) {
				candAttr.add(tokenizer.nextToken());
			}
		}
		return candAttr;
	}

	// Reading data from text ile
	public ArrayList<ArrayList<String>> readData() throws IOException {
		ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();
		InputStream in = new FileInputStream(new File(
				"TrainingData/data.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String str = "";
		while ((str = reader.readLine()) != null) {
			StringTokenizer tokenizer = new StringTokenizer(str);
			ArrayList<String> s = new ArrayList<String>();
			while (tokenizer.hasMoreTokens()) {
				s.add(tokenizer.nextToken());
			}
			datas.add(s);
		}
		return datas;
	}

	public static void main(String[] args) {
		TestData tb = new TestData();
		ArrayList<ArrayList<String>> datas = null;
		ArrayList<String> testT = null;
		// ArrayList<String> testT = new ArrayList<String>();
		NaiveTest bayes = new NaiveTest();
		try {
			System.out.println("Training Data.......");
			datas = tb.readData();
			while (true) {
				System.out.println("Enter the Test Data");
				testT = tb.readTestData();
				String c = bayes.predictClass(datas, testT);
				System.out.println("The class is: " + c);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
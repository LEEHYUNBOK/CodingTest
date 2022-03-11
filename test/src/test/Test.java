package test;

import java.io.*;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
//		String s = bf.readLine(); //String
		int k = Integer.parseInt(bf.readLine()); //Int
		for (int i = 0; i < k; i++) {
			System.out.println("다음");

			String role = bf.readLine(); // String
			switch (role) {
			case "L":
				System.out.println("모르겠네");
				break;
			case "D":
				System.out.println("D");
				break;
			case "B":
				System.out.println("B");
				break;
			case "P":
				System.out.println("P");
				break;
			}

			System.out.println("i = "+i);
		}
//		bw.write("s = "+s+"\n");
//		bw.write("i = "+i+"\n");
		bw.close();   //스트림을 닫음
	}

}

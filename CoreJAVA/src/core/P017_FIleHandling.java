package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//FileInputStream -> to read data
//FileOutputStream - > to write data
//FileWriter
//FileReader
public class P017_FIleHandling {
	public static void main(String[] args) throws IOException {
//		String msg = "this msg will store into file";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte b[] = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("data written successfully");

		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}

	}
}
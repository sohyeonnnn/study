package ch15;

import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();

		int data = 0;

		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Input Data:" + inputData);
		System.out.println("Output Data:" + output.toString());
		System.out.println("Output Data:" + output.getBuffer().toString());
	}

}

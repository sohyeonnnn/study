package ch15;

import java.io.*;

public class PipedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");

		inThread.connect(outThread.getOutput());

		inThread.start();
		outThread.start();
	}
}

class InputThread extends Thread {
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();

	InputThread(String name) {
		super(name);
	}

	public void run() {
		try {
			int data = 0;

			while ((data = input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		} catch (IOException e) {
		}
	}

	public PipedReader getInput() {
		return input;
	}

	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class OutputThread extends Thread {
	PipedWriter output = new PipedWriter();

	OutputThread(String name) {
		super(name);
	}

	public void run() {
		try {
			String msg = "Hello";
			System.out.println(getName() + " sent:" + msg);
			output.write(msg);
			output.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public PipedWriter getOutput() {
		return output;
	}

	public void connect(PipedReader input) {
		try {
			output.connect(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

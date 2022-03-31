package ch11;

import java.util.Properties;

public class PropertiesEx4 {
	// 시스템 속성을 가져오는 방법
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties sysProp = System.getProperties();
		System.out.println("java.version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		System.out.println();
		sysProp.list(System.out);
	}

}

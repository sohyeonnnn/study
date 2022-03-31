package ch11;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();

		prop.setProperty("timeout", "20");
		prop.setProperty("language", "한글"); // 유니코드로 바뀜
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");

		try {
			// store : 저장된 목록을 지정된 outstream에 출력(저장)
			prop.store(new FileOutputStream("output.txt"), "properties example");

			// storeToXML : 저장된 목록을 지정된 출력스트림에 해당 인코딩의 XML문서로 출력
			prop.storeToXML(new FileOutputStream("output.xml"), "properties example");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

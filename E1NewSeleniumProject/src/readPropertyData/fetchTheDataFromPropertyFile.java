package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fetchTheDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/Config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("Browser");
		String data1 = prop.getProperty("url");
		String data2 = prop.getProperty("username");
		String data3 = prop.getProperty("password");
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}

}

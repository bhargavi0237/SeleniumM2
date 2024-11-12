package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginScriptUsingProperies {
	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream(".//src/test/resources/Data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		
	}

}

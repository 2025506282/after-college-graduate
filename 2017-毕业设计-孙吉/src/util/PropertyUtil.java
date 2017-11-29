package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	public static String getValue(String fileDirectory, String key) {
		InputStream in;
		Properties properties = null;

		try {
			in = new BufferedInputStream(new FileInputStream(fileDirectory));
			//in = Object.class.getResourceAsStream(fileDirectory);
			properties = new Properties();
			properties.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			throw new RuntimeException();
		}

		return properties.getProperty(key);
	}

}

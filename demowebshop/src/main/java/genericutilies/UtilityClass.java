package genericutilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass implements IAutoconstants{
	public String propertyFileReader(String key) throws IOException {
Properties prop = new Properties();
FileInputStream fil=new FileInputStream("./src/test/resources/UserDetails.properties");
prop.load(fil);
          String value = prop.getProperty(key);
          return value;
	}

	
}

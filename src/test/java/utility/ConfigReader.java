package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	
	static {    
	    try {
	    FileInputStream file = new FileInputStream("src/test/resources/Config.properties");
	    prop = new Properties();
	    prop.load(file);
	    }
	    catch(Exception Ex)
	    {
	    	throw new RuntimeException ("Failed to load config.properties file", Ex);
	    } }
    
    
	public static String getProperty (String key) 
    {
     return	prop.getProperty(key);
    }
    
    
}

package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Property_file 
{
@Test
public static void getapplication() throws IOException 
{
//	String url="";
//	
//	try
//	{
		FileInputStream fis = new FileInputStream("./Config.Properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		//String url = 
				pro.getProperty("url");
		//System.out.println(url);	
	} 
//	catch (Exception e) 
//	{
//		Reporter.log("Unable to Launch", true);
//	}
//	return url;
	//}
}
	


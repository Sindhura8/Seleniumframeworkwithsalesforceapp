package Utilities;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommonUtilities {

	    public static String readfileReturnInString(String sPathOfJson) throws Exception{
	    	byte[] encoded=Files.readAllBytes(Paths.get(sPathOfJson));
	    	return new String(encoded,StandardCharsets.UTF_8);
	    }
}

package Northern;

//imports for BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class TestClass2 {
	private Pattern pattern;
	    private Matcher matcher;	

	    private static final String IPADDRESS_PATTERN =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	    public TestClass2(){
		  pattern = Pattern.compile(IPADDRESS_PATTERN);
	    }

	    public boolean validate(final String ip){
		  matcher = pattern.matcher(ip);
		  return matcher.matches();
	    }
	    
    public static void main(String args[]) {
    	TestClass test = new TestClass();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean istrue = test.validate(line);
       if(istrue)
        System.out.println("Yes");
       else
    	   System.out.println("No");
    }
}
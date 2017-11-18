package Northern;

import java.io.IOException;
/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class TestClass {
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String IP_PATTERN = 
    "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
    "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
    "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
    "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    public TestClass(){
        pattern = Pattern.compile(IP_PATTERN);
    }
    
    public boolean validate(String ip)
    {
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }
    public static void main(String args[] ) throws Exception {
        TestClass test = new TestClass();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try{
             line = br.readLine();}
        
        catch(IOException e){ 
            e.printStackTrace();
        } 
        boolean isTrue = test.validate(line);
        if(isTrue)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}

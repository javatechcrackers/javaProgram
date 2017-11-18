package com.string.puzzles;
import java.text.*;
public class MessageFormat1 {
	public static void main(String[] args) {
	
		    String message = "Here''s your choices: '{'{0}, {1}'}'.";
		    Object values[] = { "yes", "no" };
		    String s = MessageFormat.format(message, values);
		    System.out.println(s);
	    
    }
}

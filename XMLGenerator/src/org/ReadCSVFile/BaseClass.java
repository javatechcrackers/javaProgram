package org.ReadCSVFile;

public class BaseClass {
	public static String parsepath(String fileName) {
		String path = fileName;
		path.replaceAll("/", "//");
		
		return path;
	}
	
	public static String getfileName(String passfileName, String passfileName2) {
		String fileName = passfileName.concat(passfileName2).concat(".xml");
		return fileName;
	}

	public String putunderscore(String string) {
		return string.replaceAll(" ", "_");
	}

	
}

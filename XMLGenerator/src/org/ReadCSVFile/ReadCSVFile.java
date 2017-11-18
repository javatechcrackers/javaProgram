package org.ReadCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ReadCSVFile extends BaseClass {

	
	
	@SuppressWarnings({ "static-access", "static-access", "static-access" })
	public static void main(String[] args) {
		
		Import_brix brix = new Import_brix();
		Monitor_Objects_Import_Brix  Import_Brix=new Monitor_Objects_Import_Brix();
		Monitor_Dns monitor_Dns = new Monitor_Dns();
		
		//String csvFile = "C:\\Users\\Prashant K\\Documents\\monitor-objects-import-brix-dns.csv";
   	    String csvFile = null;
		//Properties prop = new Properties();
		//prop.containsKey();
		
		//String fileName = csvFile;
		
	    String fileName = JOptionPane.showInputDialog("Enter the file name with full path :: " ,  csvFile);
	    String fileFolderPath = fileName.toString().substring(0,fileName.lastIndexOf('\\') + 1);
	    String passfileName = fileName.toString().substring(fileName.lastIndexOf('\\') + 1);
	   
	    passfileName =  passfileName.substring(0, passfileName.indexOf('.'));
	    
	    System.out.println("passfileName::"+passfileName);
	    System.out.println("fileFolderPath::"+fileFolderPath);
	    
		ArrayList<String> list = new ArrayList<String>();
		// create BufferedReader to read csv file

		String line = "";
		String delims = ",";
		StringTokenizer st = null;

		int lineNumber = 0;
		int tokenNumber = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(parsepath(fileName)));
			// read comma separated file line by line
			while ((line = br.readLine()) != null) {
				break;
				// lineNumber++;
			}
			// use comma as token separator
			st = new StringTokenizer(line, ",");

			while (st.hasMoreTokens()) {
				tokenNumber++;

				// display csv values
				System.out.print(st.nextToken() + "  ");

			}
			// list.add(st.nextToken());
			String[] tokens = line.split(delims);
			int tokenCount = tokens.length;
			for (int j = 0; j < tokenCount; j++) {
				list.add(tokens[j]);
				System.out.println("\nSplit Output: " + tokens[j]);
			}

			System.out.println(list.toString());

			// reset token number
			tokenNumber = 0;

		} catch (Exception e) {
			System.err.println("CSV file cannot be read : " + e);
		}

		
		if(!(passfileName==null) && passfileName.equalsIgnoreCase("import-brix-dns")){
			brix.writefile(list , passfileName , fileFolderPath);
		}
		else if(!(passfileName==null) && passfileName.equalsIgnoreCase("monitor-objects-import-brix-dns")){
			Import_Brix.writefile(list , passfileName , fileFolderPath);
		}
		
		else if(!(passfileName==null) && passfileName.equalsIgnoreCase("monitor-type-import-brix-dns")){
			monitor_Dns.writefile(list , passfileName , fileFolderPath);
		}
		

	

}
}
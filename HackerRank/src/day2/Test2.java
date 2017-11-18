package day2;

public class Test2 {

	public static void main(String[] args) {
		String [] va = {"{}()","{}(){}[]", "){[}]("};
		String[] braces=	new Test2().braces(va);
		for(String s : braces){
		System.out.println(s);
		}
		
	}
	 String[] braces(String[] values) {
	  

		  
	        int size = values.length;
	        System.out.println(size);
	        String [] arr = new String[size];
	        for(int i=0; i < size ; i++){
	            String ch = values[i];
	            boolean a = false,b = false,c = false ;
	            for(int j =0 ; j< ch.length() ; j++){
	            	if(ch.contains("(") && ch.contains(")") ||  ch.contains("[") && ch.contains("]") || (ch.contains("{") && ch.contains("}"))){
	                if(ch.contains("(") && ch.contains(")")){
	                	int index = ch.indexOf("("); int index1 = ch.indexOf(")");
	                	if(index+1 == index1){
	                		a = true;
	                	}
	                }
	                if(ch.contains("[") && ch.contains("]")){
	                	int index = ch.indexOf("("); int index1 = ch.indexOf(")");
	                	if(index+1 == index1){
	                		b = true;
	                	}
	                }
	                if(ch.contains("{") && ch.contains("}")){
	                	int index = ch.indexOf("("); int index1 = ch.indexOf(")");
	                	if(index+1 == index1){
	                		c = true;
	                	}
	                }
	            	
	               
	            } else
	        	{
	        		System.out.println("special character are not matching");
	                    
	        	}
	            	if(a || b || c ){
	                	arr[i] = "true";
	                }else{
	                	arr[i] = "false";
	                }
	        }
	        
	        
	    }
			return arr;

}}


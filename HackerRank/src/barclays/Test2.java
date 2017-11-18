package barclays;


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class Test2 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        List<Integer> arr = new ArrayList<>() ;
        
        
        for (int i = 0; i < N; i++) {
        	Scanner s = new Scanner(System.in);
        	int number = s.nextInt();
        	if (number > 0)
        		arr.add(number);

        }
       
        List<String>  resullt = getSum(arr);
        for(String s : resullt)
        System.out.println("Hello World!" + s      );
    }

	private static List<String>  getSum(List<Integer> arr) {
		int len = arr.size();
		int sum = 0;
		List<String> result = new ArrayList<String>();
		for(int i=0; i < len ;i++){
			
			List<String> tempList = new ArrayList<String>();

			
			Iterator<Integer> iter = arr.iterator();
			while (iter.hasNext()) {
				Integer val = iter.next();

				
				if (val.equals("[]")) {
					tempList.add("[" + arr.get(i) + "]");
				} else {
					tempList.add("[" + val.toString().substring(1, arr.size() - 1) + ", " + arr.get(i) + "]");
				}
			}

			
			result.addAll(tempList);
		
			
			//sum = sum + arr[i];
			
		}
		
		for(String str :result){
			System.out.println(str);
		}
		return result;
		
		
		
		
		
	}
}

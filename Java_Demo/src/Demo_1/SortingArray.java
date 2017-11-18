package Demo_1;


public class SortingArray {
	public static void main(String a1[]){
		
		int a[]={9,2,8,6,1,4};
		int b[] ;
		int temp=0;	
		int i=0, j=0;
		
		for(i=0; i<a.length; i++){
			for(j=0; j<a.length-1; j++){
			if(a[j] > a[j+1]){
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;			
				
			}
			//System.out.println("element are : " +a[j]);
			}
			
		}
		for(i=0;i<a.length-1;i++){
			System.out.println("element are !!!!!!! : " +a[i]);
		}
		
		
		
		
		
		/*try{
			b= new int[5];
			for(i=0;i<a1.length-1;i++){
				if(a1[i] <a1[i+1]){
					temp = a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp;
				}
			}
			for(i=0;i<a1.length;i++){
				System.out.println("b : " +a1[i]);
			}
			for(i=0;i<=a1.length;i++){
				if(a1[i] >a1[i+1]){
					temp = a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp;
				}
			}
			for(i=0;i<a1.length;i++){
				System.out.println("b1 : " +a1[i]);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}*/
	
		
	}

}

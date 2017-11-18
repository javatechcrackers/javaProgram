package Demo_1;


public class SortArray {
    
       public SortArray() {
    }
   
  
   public int[] sortToArray(int []a)
   {
       int len=a.length;
       int temp;
       for(int i=0;i<len-1;i++)
       {
          
               if(a[i]<a[i+1])
               {
                temp=a[i];
                   a[i]=a[i+1];
                   a[i+1]=temp;
               }
          
          
       }
       return a;
   }
   public static void main(String argd[])
   {
         int a[]=new int[] {9,2,8,6,1,4};
         SortArray s=new SortArray();
       int b[]= s.sortToArray(a);
        for(int i=0;i<b.length;i++)
        {
            System.out.println("sort array is " + b[i]);
        }
   }
} 



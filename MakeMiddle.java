/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints length 3, return the sum of all the elements.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MakeMiddle {

    public static int [] makeMiddle(int [] nums) {  
            int []aux=new int[2];
        if(nums.length==2){
            return nums;
        }else if(nums.length>2){
            int size=nums.length;                    
            aux[0]=nums[size/2-1];
            aux[1]=nums[size/2];    
        }
        
        
        return aux;
      
}
    public static void main(String[] args) {
        int [] a= {1,2,3,5};
        int [] b= {5,11,2,5};
        int [] c= {7,0,0,10,40,20};
        
            int []x =makeMiddle(a);
    int []z=makeMiddle(c);
    int []y=makeMiddle(b);
     
        
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
         for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
          for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
          }
    }
}
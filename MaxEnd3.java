/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints length 3, figure out which is larger between 
 * the first and last elements in the array, and set all the other elements 
 * to be that value. Return the changed array. . 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MaxEnd3 {

    public static int[] maxEnd3(int []nums) {   
        int a=0;
        
        if(nums[0]>=nums[2]){
            a=nums[0];
            for(int i=0; i<nums.length; i++){
                nums[i]=a;
            }
        }else if(nums[0]<nums[2]){
            a=nums[2];
            for(int i=0; i<nums.length; i++){
                nums[i]=a;
            }
        }
        
     

        return nums;
}
    public static void main(String[] args) {
  
       int []a= {1,2,3};
       int []b= {11,5,9};
       int []c= {2,11,3};
       int []x= maxEnd3(a);
       int []y= maxEnd3(b);
       int []z= maxEnd3(c);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
       for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
       for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    
    }
}
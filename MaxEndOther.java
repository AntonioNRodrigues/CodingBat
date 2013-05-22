/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints length 3, figure out which is larger between all 
 * elements in the array, and set all the other elements 
 * to be that value. Return the changed array. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MaxEndOther {

    public static int[] maxEndOther(int []nums) {   
        int a=0;
        
        //verifica qual é o int dentro do array que é maior
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=a){
                a=nums[i];
            }
        }
        //percorre o array e coloca o valor mais alto que estra 
        for(int j=0; j<nums.length; j++){
            nums[j]=a;
        }
        

        return nums;
}
    public static void main(String[] args) {
  
       int []a= {1,2,3};
       int []b= {11,5,9};
       int []c= {2,11,3};
       int []x= maxEndOther(a);
       int []y= maxEndOther(b);
       int []z= maxEndOther(c);
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
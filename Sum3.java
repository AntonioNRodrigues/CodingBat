/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints length 3, return the sum of all the elements.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Sum3 {

    public static int sum3(int [] nums) {    
        int soma=0;
            for(int i=0; i<nums.length; i++){
                soma+=nums[i];
            }
      return soma; 
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {5,11,2};
        int [] c= {7,0,0};
    
        System.out.println(sum3(a));
        System.out.println(sum3(b));
        System.out.println(sum3(c));
    }
}
/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints, return the sum of the first 2 elements in the array. 
 * If the array length is less than 2, just sum up the elements that exist, 
 * returning 0 if the array is length 0. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Sum2 {

    public static int sum2(int [] nums) {
        int soma=0;
        if(nums.length==0){
            soma=0;
        }else if(nums.length<2){
            soma=nums[0];
        }else if(nums.length>=2){
            for(int i=0; i<2; i++){
                soma+=nums[i];
            }
        }
        return soma;
            
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {6,1,2,3};
        int [] c= {13,6,1,2,3};
        int [] d= {1,1};
        
    
        System.out.println(sum2(a));
        System.out.println(sum2(b));
        System.out.println(sum2(c));
        System.out.println(sum2(d));
    }
}
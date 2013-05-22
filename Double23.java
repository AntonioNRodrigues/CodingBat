/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array, return true if the array contains 2 twice, or 3 twice. 
 * The array will be length 0, 1, or 2.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Double23 {

    public static boolean double23(int [] nums) {
        int condFor2=0;
        int condFor3=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==2){
                 condFor2++;
           }else if (nums[i]==3){
               condFor3++;
           }
        }
        if(condFor2==2||condFor3==2){
            return true;
        }
      
       return false;
}
    public static void main(String[] args) {
        int [] a= {1,2,2};
        int [] b= {1,3,3,1};
        int [] c= {1,6,1};
    
        System.out.println(double23(a));
        System.out.println(double23(b));
        System.out.println(double23(c));
    }
}
/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array length 2, return false if it contains a 2 or a 3. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class No23 {

    public static boolean no23(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==2||nums[i]==3){
                return false; 
           }
        }
      
       return true;
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {1,0,1,1};
        int [] c= {1,6,1};
    
        System.out.println(no23(a));
        System.out.println(no23(b));
        System.out.println(no23(c));
    }
}
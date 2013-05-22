/*
 * Classe for the exercice found in www.codingbat.com -->
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2
 * positions in the array.  
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class Unlucky1 {

    public static boolean unlucky1(int [] nums) {
        int a=nums.length;
        boolean ver=false;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1&&(i!=a-1)){
                if(i==(a-a)||i==(a-a+1)||i==(a-2)||i==(a-1)){
                    if(nums[i+1]==3){
                        ver=true;
                    }
                }
            }            
        }
       return ver;
}
    public static void main(String[] args) {
        int [] a= {1,3,4,5};
        int [] b= {2,1,3,1,3};
        int [] c= {1,1,1,1};
        int [] d= {};
        
        System.out.println(unlucky1(a));
        System.out.println(unlucky1(b));
        System.out.println(unlucky1(c));
        System.out.println(unlucky1(d));
    }
}
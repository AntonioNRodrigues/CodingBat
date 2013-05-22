/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class FrontPiece {

    public static int [] frontPiece(int []nums) {
        int aux[] = null;
        
        if(nums.length>=2){
            aux= new int [2];
            for (int i = 0; i < 2; i++) {
                aux[i]=nums[i];
                
            }
        }else{
            aux= new int [nums.length]; 
            for (int i = 0; i < nums.length; i++) {
            aux[i]=nums[i];
            }
            return aux;
        }
        return aux;
 
}
    public static void main(String[] args) {
    int [] a= {1,2,3}, b= {}, c= {1,5};
    int x[]=frontPiece(a);
    int y[]=frontPiece(b);
    int z[]=frontPiece(c);
    
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
        }
        System.out.println(""); 
    
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
        }
        System.out.println("");

    }
}
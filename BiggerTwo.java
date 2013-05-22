/*
 * Classe for the exercice found in www.codingbat.com -->
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the 
 * values in each array. Return the array which has the largest sum. In event 
 * of a tie, return a. 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class BiggerTwo {

    public static int[] start1(int []a, int []b) {
       int somaA=0;
       int somaB=0;
       
        for (int i = 0; i < a.length; i++) {
            somaA+=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            somaB+=b[i];
        }
        
        if(somaA>=somaB){
            return a;
        }else{
            return b;
        }

}
    public static void main(String[] args) {
    int [] a= {1,2}, b= {1,3}, c= {7,2}, d= {1,5}, e= {1,2}, f= {4,7};
    
    int []x =start1(a, b);
    int []z=start1(c, d);
    int []y=start1(e, f);
     
        
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
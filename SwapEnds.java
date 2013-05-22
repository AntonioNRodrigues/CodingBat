/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints, swap the first and last elements in the array. 
 * Return the modified array. The array length will be at least 1.
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class SwapEnds {

    public static int [] swapEnds(int []a) {
        int first=a[0];
        int last=a[a.length-1];
        
        for (int i = 0; i < a.length; i++) {
           a[0]=last;
           a[a.length-1]=first;
        }
        return a;
       
}
    public static void main(String[] args) {
    int [] a= {1,2,3,4}, b= {1,2,3}, c= {8,6, 7,9,5};
    
    int []x =swapEnds(a);
    int []z=swapEnds(b);
    int []y=swapEnds(c);
     
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
         for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
        }
         System.out.println("");
          for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
          }

    }
}
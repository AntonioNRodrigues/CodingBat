/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints of odd length, return a new array length 3 
 * containing the elements from the middle of the array. 
 * The array length will be at least 3. 

 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class MidThree {

    public static int [] midThree(int []a) {
        int []aux= new int[3];
        int tam=(int)a.length/2;  
        
        
            for(int i=0; i<aux.length; i++){
                aux[i]=a[tam-1+i];
            }
        return aux;
       
}
    public static void main(String[] args) {
    int [] a= {1,2,3,4,5}, b= {1,2,3}, c= {8,6, 7,5,3,0,9};
    
    int []x =midThree(a);
    int []z=midThree(b);
    int []y=midThree(c);
     
        
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
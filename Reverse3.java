/*
 * Classe for the exercice found in www.codingbat.com -->
 * Return an int array length 3 containing the first 3 
 * digits of pi, {3, 1, 4}. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Reverse3 {

    public static int[] reverse3(int []nums) {   
        int []aux= new int [3];
        int j=2;
        for (int i = 0; i < nums.length; i++) {
            aux[j]=nums[i];
            j--;
        }

        return aux;
}
    public static void main(String[] args) {
  
       int []a= {1,2,3};
       int []b= {5,11,9};
       int []c= {7,0,0};
       int []x=reverse3(a);
       int []y=reverse3(b);
       int []z= reverse3(c);
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
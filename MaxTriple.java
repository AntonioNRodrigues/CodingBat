/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints of odd length, look at the first, last, and middle 
 * values in the array and return the largest. The array length will 
 * be a least 1. 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class MaxTriple {

    public static int maxTriple(int []a) {
        int maior=0;
        int meio=(int)a.length/2;
       
        for (int i = 0; i < a.length; i+=meio) {
               int cont=a[i];
               if(cont>=maior){
                   maior=cont;
               }
        }
        return maior;
       
}
    public static void main(String[] args) {
    int [] a= {1,2,3,4,5}, b= {1,5,3}, c= {8,6,7,5,3,10,11,9,8};
    
    int x =maxTriple(a);
    int z=maxTriple(b);
    int y=maxTriple(c);
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

    }
}
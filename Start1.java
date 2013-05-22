/*
 * Classe for the exercice found in www.codingbat.com -->
 * Start with 2 int arrays, a and b, of any length. Return how many of the 
 * arrays have 1 as their first element. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Start1 {

    public static int start1(int []a, int []b) {
        int startWithOne1=0;
        
        if(a.length>=1){
            if(a[0]==1){
                startWithOne1++;
            }
        }
        if(b.length>=1){
            if(b[0]==1){
                startWithOne1++;
            }
        }   
        return startWithOne1;
}
    public static void main(String[] args) {
    int [] a= {1,2,3}, b= {1,3}, c= {7,2,3}, d= {1}, e= {1,2}, f= {};
  
       
            System.out.println(start1(a, b));
            System.out.println(start1(c, d));
            System.out.println(start1(e, f));
       

    }
}
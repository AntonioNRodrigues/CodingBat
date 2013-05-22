/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 arrays of ints, a and b, return true if they have the same first 
 * element or they have the same last element. Both arrays will be length 
 * 1 or more. . 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class CommonEnd {

    public static boolean commondEnd(int []a, int []b) {
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[0]==b[0]||a[a.length-1]==b[b.length-1]){
                    return true;
                }
            }
        }
    return false;
}
    public static void main(String[] args) {
    int [] a= {1,2,3}, b= {7,3}, c= {1,2,1}, d= {7,3,2}, e= {1,2,3}, f= {1,3};
        
        System.out.println(commondEnd(a, b));
        System.out.println(commondEnd(c, d));
        System.out.println(commondEnd(e, f));

    }
}
/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much 
 * as will fit, the elements from a followed by the elements from b. The arrays 
 * may be any length, including 0, but there will be 2 or more elements 
 * available between the 2 arrays.
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Make2 {

    public static int [] make2(int []a, int []b) {
     int aux[]= new int[2];
       
        for (int i = 0; i < aux.length; i++) {
        
            if(a.length!=0 && a.length>=aux.length){
                aux[i]=a[i];
            }
            if(a.length!=0 && a.length==1){
                aux[0]=a[0];
                aux[1]=b[0];
            }
            if(a.length==0){
                aux[i]=b[i];
            }
        }
        
    return aux;
}
    public static void main(String[] args) {
    int [] a= {4,5}, b= {1,7,3}, c= {4}, d= {1,3,2}, e= {}, f= {1,3};
        int x[]=make2(a, b);
        int z[]=make2(c, d);
        int y[]= make2(e, f);
        
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
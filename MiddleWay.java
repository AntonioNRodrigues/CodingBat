/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 
 * containing their middle elements. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MiddleWay {

    public static int [] middleWay(int []x, int []y) {
        int middle1=0;
        int middle2=0;
        int aux [] = new int[2];
        
        for (int i = 0; i < x.length; i++) {
            middle1=x[(int)x.length/2];
        }
        for (int i = 0; i < y.length; i++) {
            middle2=y[(int)y.length/2];
        }
        aux[0]=middle1;
        aux[1]=middle2;

        return aux;
}
    public static void main(String[] args) {
    int [] a= {1,2,3}, b= {7,3,5}, c= {1,5,1}, d= {7,3,2}, e= {1,2,3}, f= {1,10,8};
  
        for (int i = 0; i < middleWay(a, b).length; i++) {
            System.out.print(middleWay(a, b)[i] + " ");
        }
        for (int i = 0; i < middleWay(c, d).length; i++) {
            System.out.print(middleWay(c, d)[i] + " ");
        }
        for (int i = 0; i < middleWay(e, f).length; i++) {
            System.out.print(middleWay(e, f)[i] + " ");
        }

    }
}
import java.util.*;

//Classical Algebra-Mathematics-finding the characteristic equation  of 2*2 matrix using the Cayley Hamilton Theorem

class CaleyHamitonTheorem {
    public static void main(String[] args) {
        int A[][]={
            {1, 2},
            {3,4}
        };
        int a = A[0][0];
        int b = A[0][1];
        int c = A[1][0];
        int d = A[1][1];
    //sum of the diagonals
     int s1 = a+d;
     //find the determinants of matrix
     int s2 = a*d-b*c;
     
     System.out.println("A^2 "+ -s1 + "A "+ +s2 + "=0" );
     
    }
}
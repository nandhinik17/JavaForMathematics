import java.util.*;

/*Classical Algebra-Mathematics-Find the Remainder and Quotient Coefficients using the Synthetic Division
 Example: 2x^3 - 6x^2 + 4x + 8 divided by (x - 2)
 
 A fast and simplified method to divide a polynomial using only its coefficients.
 It replaces long division with repeated:
      1. Bring down
      2. Multiply
      3. Add


  */
class SyntheticDivisionToFindRemainerAndQuotient {
    public static void main(String[] args) {
        int[] coefficients = {2, -6, 4, 8};
        int root = 2;
        int[] result = new int[coefficients.length];
        result[0] = coefficients[0];
        for(int i=1; i<coefficients.length; i++){
            result[i]=result[i-1]*root + coefficients[i];
        }
        System.out.println("The Quotient Coefficianet was " + Arrays.toString(result));
        System.out.println("The Remainder was " + result[result.length-1]);
     
    }
}

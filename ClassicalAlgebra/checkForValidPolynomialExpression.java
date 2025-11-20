import java.util.*;

/*Given a string like "3x^2 + 4x - 1", check if it is a valid polynomial expression or not. Valid: "2x^3 - x + 9" Invalid: "3x^2y + 2" (more than one variable)*/
class checkForValidPolynomialExpression {
    
    public static String checkPolynomial(String val){
        Set<Character> set = new HashSet<Character>();
        for(char ch: val.toCharArray()){
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }
        if(set.size()==0 || set.size()==1){
            return "valid Polynomial Expression";
        }
        else{
            return "Ivalid Polynomial Expression";
        }
    }
    public static void main(String[] args) {
        System.out.println("The result of given Polynomial " + checkPolynomial("3x^2 + 4x - 1"));
        System.out.println("The result of given Polynomial " + checkPolynomial("3x^2y + 2"));
     
     
    }
}

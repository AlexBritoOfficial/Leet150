import java.util.Stack;

public class ValidParentheses20 {


    public static void main(String[] args) {

        // Case 1: "()" Success
        // Case 2: "()[]{}" Success
        // Case 3: "(]" Success
        // Case 4: "{[]}" Fail

        System.out.println(ValidParentheses20.isValid("){"));



    }

    public static boolean isValid(String s){

        if(s.length() == 1 ){
            return false;
        }

        char[] characters = s.toCharArray();
        Stack<Character> left = new Stack<>();

        for (int i = 0; i < characters.length; i++) {

            if((int)characters[i] == 40 || (int) (int)characters[i] == 91  || (int)characters[i] == 123){
              left.push(characters[i]);
            }

            else if (!left.isEmpty() && (int)characters[i] - left.peek().charValue() == 1 || !left.isEmpty() && (int)characters[i] - left.peek().charValue() == 2){
                    left.pop();
                }
            else
                return false;
        }

        if (left.size() > 0){
            return false;
        }

        return true;
    }

}

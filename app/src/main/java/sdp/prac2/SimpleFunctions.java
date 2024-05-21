package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public boolean isBracketMatched(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(') {
                stack.push(curr);
            } else if (curr == ')' && !stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

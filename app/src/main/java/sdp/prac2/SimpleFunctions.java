package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public boolean isBracketMatched(String s) {
        int openCount = 0, closeCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(') {
                openCount++;
            } else if (curr == ')') {
                closeCount++;
            }
        }
        return openCount == closeCount;
    }
}



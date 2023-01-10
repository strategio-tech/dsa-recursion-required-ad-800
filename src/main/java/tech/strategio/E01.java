package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        // iterative
        if (n == 1) return 0;
        if (n == 2) return 1;

        int first = 0;
        int second = 1;
        int result = 0;

        // 3 -- 0 + 1 = 1, 4 -- 1 + 1 = 2, 5 -- 1 + 2 = 3
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}

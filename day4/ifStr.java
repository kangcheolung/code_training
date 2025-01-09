package day4;


class Solution4 {
    public int solution(String ineq, String eq, int n, int m) {
        return (ineq.equals(">") && eq.equals("=") && n >= m) ||
                (ineq.equals("<") && eq.equals("=") && n <= m) ||
                (ineq.equals(">") && eq.equals("!") && n > m) ||
                (ineq.equals("<") && eq.equals("!") && n < m) ? 1 : 0;
    }
}

public class ifStr {
    public static void main(String[] args) {

    }
}

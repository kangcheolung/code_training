package day4;

class Solution1 {
    public int solution(int num, int n) {
        int answer = 0;
        answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}

// 공배수
class Solution2 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer = number%n==0 && number%m == 0 ? 1:0;
        return answer;
    }
}

// flag에 따라 다른 값 반환하기(true면 더하고 false면 빼기)
class Solution3 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ==true ? a+b : a-b;
        return answer;
    }
}

//


public class nToMul {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int num = 10;
        int n = 2;
        System.out.println(sol.solution(num, n));
    }
}

package day4;

//홀짝에 따라 다른 값 반환하기
class Solution {
    public int solution(int n) {
        int sum = 0;
        return n % 2 == 1 ?
                sumOdd(n) :
                sumEvenSquares(n);
    }

    private int sumOdd(int n){
        int sum = 0;
        for (int i=1; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }

    private int sumEvenSquares(int n){
        int sum = 0;
        for(int i=2; i<=n; i += 2){
            sum += i*i;
        }
        return sum;
    }
}

public class OddOrSquares {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println(sol.solution(n));
    }
}

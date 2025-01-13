package day5;
// 원소들의 합과 곱
class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;

        int sum  = 0;
        int mul = 1;

        for(int i : num_list) {
            sum += i;
            mul *= i;
        }

        answer = Math.pow(sum,2) > mul ? 1 : 0;

        return answer;
    }
}
public class getSumAndMul {
    public static void main(String[] args) {

    }
}

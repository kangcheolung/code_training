package day5;

// 등차수열의 특정한 항만 더하기
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i=0; i<included.length; i++){
            int cur = a + (i*d);

            if(included[i]){
                answer += cur;
            }
        }

        return answer;
    }
}

public class arithmeticSequence {

    public static void main(String[] args) {

    }
}

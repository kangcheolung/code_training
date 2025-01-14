package day6;
//마지막 두 원소
class Solution {
    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length + 1];

        // 기존 배열 복사
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if(answer[num_list.length-1] > answer[num_list.length-2]) {
            answer[num_list.length] = answer[num_list.length-1] - answer[num_list.length-2];
        } else {
            answer[num_list.length] = answer[num_list.length-1] * 2;
        }

        return answer;
    }
}
public class lastTwo {

}

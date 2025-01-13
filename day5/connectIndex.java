package day5;
// 이어 붙인수
class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for(int num:num_list){
            if(num%2==0){
                even.append(num);
            }else{
                odd.append(num);
            }
        }

        return Integer.parseInt(even.toString()) +
                Integer.parseInt(odd.toString());

    }
}
public class connectIndex {
}

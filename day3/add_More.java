package day3;

class Solution4 {
    public int solution(int a, int b) {
        int answer = 0;

        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        int aNum = Integer.parseInt(ab);
        int bNum = Integer.parseInt(ba);

        answer = Math.max(aNum, bNum);

        return answer;
    }
}

public class add_More {

}

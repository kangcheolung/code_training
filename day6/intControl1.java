package day6;
//수 조작하기 1
class Solution2 {
    public int solution(int n, String control) {
        int answer = n;

        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);

            switch(c){
                case 'w':
                    answer+=1;
                    break;
                case 's':
                    answer-=1;
                    break;
                case 'd':
                    answer+=10;
                    break;
                case 'a':
                    answer-=10;
                    break;
            }
        }
        return answer;
    }
}

class Solution3 {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1];

            switch(diff) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }

        return answer.toString();
    }
}
public class intControl1 {
}

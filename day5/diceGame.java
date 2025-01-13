package day5;
//주사위 게임2
class Solution2 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a==b && b==c){
            answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c);
        }

        else if(a==b || b==c || c==a){
            answer = (a + b + c) * (a*a + b*b + c*c );
        }

        else{
            answer = a + b + c;
        }

        return answer;
    }
}

public class diceGame {
    public static void main(String[] args) {

    }
}

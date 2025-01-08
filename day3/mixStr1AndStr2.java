package day3;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i=0; i<str1.length(); i++){
            answer += str1.charAt(i) + "" + str2.charAt(i);
        }
        return answer;
    }
}

public class mixStr1AndStr2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트 케이스 1
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(sol.solution(str1, str2));  // "ababababab" 출력

        // 테스트 케이스 2
        str1 = "hello";
        str2 = "world";
        System.out.println(sol.solution(str1, str2));  // "hweolrllod" 출력
    }
}
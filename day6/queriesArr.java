package day6;
// 수열과 구간 쿼리 3
class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries) {

            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }

        return arr;
    }
}
// 수열과 구간 쿼리 2
public class queriesArr {

}

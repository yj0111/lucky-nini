import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        //거꾸로 올라가면서 더해주기
        for(int i = triangle.length-1; i> 0; i--){
            for(int j = 0; j<triangle[i].length-1; j++){
                triangle[i-1][j] += Math.max(triangle[i][j] , triangle[i][j+1]);
            }
        }
        
        return triangle[0][0];
    }
}
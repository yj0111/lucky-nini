import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dp = new int[12];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++){
            int n = sc.nextInt();

            for(int i = 4; i<=n; i++){
                dp[i] =  dp[i-1] + dp[i-2] + dp[i-3];
            }

            System.out.println(dp[n]);
        }
    }
}
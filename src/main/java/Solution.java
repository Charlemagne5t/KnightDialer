public class Solution {
    public int knightDialer(int n) {
        int[][] phone = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 10}
        };
        Integer[][][] memo = new Integer[4][3][n];
        int mod = 1_000_000_007;

        int result = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (phone[i][j] != 10) {
                    result = (result + dfs(phone, i, j, n - 1, memo) % mod) % mod;
                }
            }
        }

        return result;
    }

    private int dfs(int[][] phone, int i, int j, int n, Integer[][][] memo) {
        if (i > 3 || i < 0 || j > 2 || j < 0 || phone[i][j] == 10) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if(memo[i][j][n] != null){
            return memo[i][j][n];
        }

        int[][] knightMoves = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
        int mod = 1_000_000_007;
        int result = 0;

        for (int[] move : knightMoves) {
            result = (result + (dfs(phone, i + move[0], j + move[1], n - 1, memo)) % mod) % mod;
        }
        memo[i][j][n] = result;
        return result;
    }
}

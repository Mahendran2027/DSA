class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int number = neighbor(board,i,j);
                if(board[i][j] == 1 && (number > 3 || number < 2)){
                    board[i][j] = 2;
                }
                else if(board[i][j] == 0 && number == 3){
                    board[i][j] = 3;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                if (board[i][j] == 3) board[i][j] = 1;
            }
        }
        return;
    }
    private int neighbor(int[][] board, int i, int j) {

        int count = 0;
        int m = board.length;
        int n = board[0].length;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int k=0;k<8;k++){
            int ni = i + dx[k];
            int nj = j + dy[k];
            if(ni >= 0 && ni < m && nj >= 0 && nj < n){
                if(board[ni][nj] == 1 || board[ni][nj] == 2) count++;
            }
        }
        return count;
    }
}
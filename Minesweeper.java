public class Minesweeper {

    public static void main(String[] args) {

        int[][] bombs = {{0,0},{1,2},{2,2}};
        int row = 3;
        int col = 4;

        mine_sweeper(bombs, row, col);
        
        
        // output
        // -1 2 1 1 
        // 1 3 -1 2 
        // 0 2 -1 2 
    }

    public static int[][] mine_sweeper(int[][] bombs, int num_rows, int num_cols) {
        // there's gonna be num_rows x int num_cols
        int[][] mine = new int[num_rows][num_cols];
        for (int[] bomb : bombs) {
            int bomb_row = bomb[0];
            int bomb_col = bomb[1];

            mine[bomb_row][bomb_col] = -1;

            for(int r = bomb_row-1;  r <= bomb_row+1; r++){
                for(int c = bomb_col-1;  c <= bomb_col+1; c++){
                    if((0<=r && r<num_rows) && (0<=c && c<num_cols) && mine[r][c]!= -1) {
                        mine[r][c]++;
                    }
                }
            }
        }



        for(int row = 0; row < num_rows; row++) {
            for (int col = 0; col < num_cols; col++) {
                System.out.print( mine[row][col]+" ");
            }
            System.out.println();
        }

        return mine;
    }
}

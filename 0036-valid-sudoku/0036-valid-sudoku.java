class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        //row
        for(int i = 0; i < row; i++)
        {
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j = 0; j < col; j++)
            {
                char ch = board[i][j];
                if(board[i][j] == '.')
                {
                    continue;
                }
                if(hm.containsKey(ch))
                {
                   return false;
                }
                else
                {
                    hm.put(ch, 1);
                }
            }
        }

        //column
        for(int j = 0; j < col; j++)
        {
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int i = 0; i < row; i++)
            {
                char ch = board[i][j];
                if(board[i][j] == '.')
                {
                    continue;
                }
                if(hm.containsKey(ch))
                {
                    return false;
                }
                else
                {
                    hm.put(ch, 1);
                }
            }
        }

        //each 9 X 9 Grid
        for(int boxrow = 0; boxrow < 9; boxrow += 3)
        {
            for(int boxcol = 0; boxcol < 9; boxcol += 3)
            {
                HashMap<Character, Integer> hm = new HashMap<>();
                
                for(int i = boxrow; i < boxrow + 3; i++)
                {
                    for(int j = boxcol; j < boxcol + 3; j++)
                    {
                        char ch = board[i][j];

                        if(ch == '.')
                        {
                            continue;
                        }

                        if(hm.containsKey(ch))
                        {
                            return false;
                        }
                        else
                        {
                            hm.put(ch,1);
                        }
                    }
                }
            }
        }
        return true;
    }
}
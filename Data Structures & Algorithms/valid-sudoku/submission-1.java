class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        HashSet<Integer> set2 = new HashSet<>();



       // here make the 9 hashset for each
        for(int i = 0;i<n;i++){
           rows[i] = new HashSet<Character>();
           cols[i] = new HashSet<Character>();
           boxes[i] = new HashSet<Character>();
               
            }

            // if the sudoku contains . then continue

            for(int r = 0;r< board.length;r++){
                for(int c = 0;c< board[0].length;c++){
                    char cell = board[r][c];

                    if(cell == '.') continue;

                    // check if row have duplicate if yes return false

                    if(rows[r].contains(cell)){
                        return false;
                    }

                      rows[r].add(cell);


                 // check if cols have duplicate if yes return false

                      if(cols[c].contains(cell))
                      {
                        return false;
                      }

                      cols[c].add(cell);


                      // creating boxIndexes

                      int boxIndex = 3 *(r/3) + (c/3);

                         // check if boxIndexes have duplicate if yes return false

                      if(boxes[boxIndex].contains(cell)){
                        return false;
                      }
                      boxes[boxIndex].add(cell);
                }
            }
            return true;

            
        }

    }


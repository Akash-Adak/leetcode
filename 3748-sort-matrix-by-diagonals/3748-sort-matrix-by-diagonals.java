class Solution {
    public int[][] sortMatrix(int[][] grid) {
   
        int n = grid.length;

        // Sort diagonals in the bottom-left triangle (including middle diagonal)
        for (int i = 0; i < n; i++) {
            sortDiagonal(grid, i, 0, true); // Sort in non-increasing order
        }
        for (int j = 1; j < n; j++) {
            sortDiagonal(grid, 0, j, false); // Sort in non-decreasing order
        }

        return grid;
    }

    private  void sortDiagonal(int[][] grid, int startRow, int startCol, boolean descending) {
        int n = grid.length;
        List<Integer> diagonal = new ArrayList<>();
        int row = startRow, col = startCol;

        // Collect diagonal elements
        while (row < n && col < n) {
            diagonal.add(grid[row][col]);
            row++;
            col++;
        }

        // Sort the diagonal
        if (descending) {
            diagonal.sort(Collections.reverseOrder());
        } else {
            diagonal.sort(Comparator.naturalOrder());
        }

        // Place sorted elements back into the grid
        row = startRow;
        col = startCol;
        for (int value : diagonal) {
            grid[row][col] = value;
            row++;
            col++;
        }
    }

  

}
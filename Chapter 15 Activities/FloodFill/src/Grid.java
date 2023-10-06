import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<pair> pairs = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int count = 1;
        pair first = new pair(row, column);
        pairs.push(first);

        while (pairs.size() > 0){
            pair p = pairs.pop();
            pixels[p.getRow()][p.getCol()] = count;
            count++;

            if (p.getRow() + 1 < 10 && pixels[p.getRow() + 1][p.getCol()] == 0 && !pairs.contains()){
                pairs.push(new pair(p.getRow() + 1, p.getCol()));
            }
            if (p.getCol() + 1 < 10 && pixels[p.getRow()][p.getCol() + 1] == 0){
                pairs.push(new pair(p.getRow(), p.getCol() + 1));
            }
            if (p.getRow() - 1 > -1 && pixels[p.getRow() - 1][p.getCol()] == 0){
                pairs.push(new pair(p.getRow() - 1, p.getCol()));
            }
            if (p.getCol() - 1 > -1 && pixels[p.getRow()][p.getCol() - 1] == 0){
                pairs.push(new pair(p.getRow(), p.getCol() - 1));
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}

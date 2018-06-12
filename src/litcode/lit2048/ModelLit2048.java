package litcode.lit2048;

import java.util.Arrays;

public class ModelLit2048
{
  public int numberOfRows()
  {
    return 4;
  }

  public int[] row(int whichRow)
  {
    int[] row = new int[4];
    Arrays.fill(row, whichRow+1);
    return row;
  }
}

package litcode.lit2048;

import java.util.Arrays;
import java.util.Random;

public class ModelLit2048
{
  private Random random;
  private int[][] array2d;

  public ModelLit2048()
  {
    random=new Random();
    array2d=new int[4][4];
    array2d[2][2]=newNumber();
  }

  public int numberOfRows()
  {
    return 4;
  }

  public int[] row(int whichRow)
  {
    return array2d[whichRow];
  }
  private int newNumber()
  {
    int randomNumber=random.nextInt(10);

    if(randomNumber < 7 )
    {
      return 2;
    }
  else
    {
      return 4;
    }
    }


}

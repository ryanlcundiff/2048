package litcode.lit2048;

import java.util.Arrays;
import java.util.Random;

public class ModelLit2048
{
  private Random random;
  private int[][] array2d;
  private ViewLit2048 view;

  public ModelLit2048(ViewLit2048 view)
  {
    this.view=view;
    random=new Random();
    array2d=new int[4][4];
    placeRandomTile();
    placeRandomTile();
    view.displayBoard(this);
  }

  public boolean gameOver()
  {
    return false;

  }
  public int numberOfRows()
  {
    return 4;
  }

  public int[] row(int whichRow)
  {
    return array2d[whichRow];
  }

  private void placeRandomTile()
  {
   int x;
   int y;
    do
    {
      x = random.nextInt(4);
      y = random.nextInt(4);
    }
    while(array2d[x][y]>0);
    array2d[x][y]=newNumber();
  }


  private int newNumber()
  {
    int randomNumber=random.nextInt(10);

    if(randomNumber < 6 )
    {
      return 2;
    }
  else
    {
      return 4;
    }
    }


}

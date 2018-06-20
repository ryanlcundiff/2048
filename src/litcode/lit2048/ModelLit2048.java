package litcode.lit2048;

import java.util.Random;

public class ModelLit2048

{
  private boolean quit;
  private Random random;
  private int[][] array2d;
  private ViewLit2048 view;


  protected ModelLit2048(ViewLit2048 view)
  {
    this.view=view;
    quit = false;
    random=new Random();
    array2d=new int[4][4];
    placeRandomTile();
    placeRandomTile();
    view.displayBoard(this);
  }
  public void move(PossibleMoves move)
  {
    if (move == PossibleMoves.Quit)
    {
      quit = true;
      return;
    }
    //we need to make this work

    for (int i=0; i<numberOfRows(); i++)
    {
      slideRow(row(i));
      mergeRow(row(i));
      slideRow(row(i));
    }
    placeRandomTile();
    view.displayBoard(this);
  }

  private void slideRow(int[] row)
  {
    for (int i=0; i<row.length-1; i++)
    {
      for (int j=0; j<row.length-1; j++)
      {
        if (row[j] == 0 && row[j+1] !=0)
        {
          row[j] = row[j+1];
          row[j+1] = 0;
        }
      }
    }

  }
  private void mergeRow(int[] row)
  {
    for (int i=0; i<row.length-1; i++)
    {
      if (row[i] == row[i+1])
      {
         row[i] = 2*row[i];
         row[i+1] = 0;
      }
    }
  }

  public boolean gameOver()
  {
    return quit;

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

    if(randomNumber <6 )
    {
      return 2;
    }
  else
    {
      return 4;
    }
    }


}

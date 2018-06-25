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
      System.out.println("GOODBYE");
      return;
    }
    if (move == PossibleMoves.Up)
    {
      rotate();
      moveLeft();
      rotate();
      rotate();
      rotate();
    }
    if (move == PossibleMoves.Down)
    {
      rotate();
      rotate();
      rotate();
      moveLeft();
      rotate();
    }
    if (move == PossibleMoves.Left)
    {
      moveLeft();

    }
    if (move == PossibleMoves.Right)
    {
      rotate();
      rotate();

      moveLeft();
      rotate();
      rotate();
    }

    placeRandomTile();
    view.displayBoard(this);
  }

  protected void moveLeft()
  {

    for (int i=0; i<numberOfRows(); i++)
    {
      slideRow(row(i));
      mergeRow(row(i));
      slideRow(row(i));
    }
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

  protected void rotate()
  {
    int[][] array2dx2 = new int[4][4];

    for (int i=0; i<numberOfRows(); i++)
    {
      for (int j = 0; j < row(i).length; j++)
      {
        array2dx2[3-j][i] = array2d[i][j];
      }


    }
    array2d = array2dx2;
  }



  protected boolean boardFull()
  {
    for (int i=0; i<numberOfRows(); i++)
    {
      for (int j=0; j<row(i).length; j++)
      {
        if (array2d[i][j] == 0)
        {
          return false;
        }
      }
    }
    return true;
  }

  public boolean gameOver()
  {
    return quit || boardFull();

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

package litcode.lit2048;

public class MoveInput
{
  public PossibleMoves nextMove()
  {
    do
    {
      System.out.print("Enter Your Move(wasd): ");
      String move = System.console().readLine();
      if (move.equals("w"))
      {
        return PossibleMoves.Up;
      }

      if (move.equals("a"))
      {
        return PossibleMoves.Left;
      }
      if (move.equals("s"))
      {
        return PossibleMoves.Down;
      }

      if (move.equals("d"))
      {
        return PossibleMoves.Right;
      }
      if (move.equals("q"))
      {
        return PossibleMoves.Quit;
      }
      System.out.println("Invalid Move");
    }
    while(true);
  }

}



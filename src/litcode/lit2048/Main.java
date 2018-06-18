package litcode.lit2048;

public class Main
{
  public static void main(String[] args)
  {
    ViewLit2048 view = new ViewLit2048();
    ModelLit2048 model = new ModelLit2048(view);
    MoveInput input = new MoveInput();
    while (!model.gameOver())
    {
      //ask for next move
      PossibleMoves move = input.nextMove();
      //executes the move
      model.move(move);
    }
  }
}
package litcode.lit2048;

public class Main
{
  public static void main(String[] args)
  {
    ModelLit2048 model = new ModelLit2048();
    ViewLit2048 view = new ViewLit2048();
    view.displayBoard(model);
  }
}

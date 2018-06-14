package litcode.lit2048;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    ViewLit2048 view = new ViewLit2048();
    ModelLit2048 model = new ModelLit2048(view);
    while (!model.gameOver())
    {
      Scanner s = new Scanner(System.in);

      System.out.print("ENTER YOUR MOVE");
      //String move = s.next();
      //System.out.println("MOVE: " + move);
    }
  }
}
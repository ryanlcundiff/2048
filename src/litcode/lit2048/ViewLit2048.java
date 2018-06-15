package litcode.lit2048;

public class ViewLit2048
{
  private static String TOP_LEFT_CORNER = "\u250f";
  private static String BOTTOM_LEFT_CORNER = "\u2517";
  private static String TOP_RIGHT_CORNER = "\u2513";
  private static String BOTTOM_RIGHT_CORNER = "\u251b";
  private static String UP_AND_DOWN_LINE = "\u2503";
  private static String SIDE_TO_SIDE_LINE = "\u2501";

  public ViewLit2048()
  {

  }

  public void displayBoard(ModelLit2048 model)
  {
    for (int i=0; i<model.numberOfRows(); i++) {
      displayRow(model.row(i));
    }

  }

  public void displayRow (int[] row){



    for (int i=0; i<row.length; i++) {
      System.out.print(TOP_LEFT_CORNER+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+TOP_RIGHT_CORNER);

    }
    System.out.println("");
    for (int i=0; i<row.length; i++) {
      System.out.print(UP_AND_DOWN_LINE);
      System.out.print (" "+" "+" ");
      if (row[i]==0)
      {
        System.out.print(" ");
      }
      else
      {
        System.out.print(row[i]);
      }
      System.out.print(UP_AND_DOWN_LINE);

    }
    System.out.println("");
    for (int i=0; i<row.length; i++) {
      System.out.print(BOTTOM_LEFT_CORNER+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+BOTTOM_RIGHT_CORNER);
    }
    System.out.println("");
  }
}

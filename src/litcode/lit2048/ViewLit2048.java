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
  {}

  public void display(ModelLit2048 model)
  {
    System.out.println(TOP_LEFT_CORNER+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+TOP_RIGHT_CORNER);
    System.out.println(UP_AND_DOWN_LINE+" "+"4"+" "+" "+UP_AND_DOWN_LINE);
    System.out.println(BOTTOM_LEFT_CORNER+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+SIDE_TO_SIDE_LINE+BOTTOM_RIGHT_CORNER);
  }
}

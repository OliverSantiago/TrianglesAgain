public class PointTester{
  public static void main(String[]args){
    Point One = new Point(2.0,4.0);
    Point Two = new Point(2.0,2.0);
    Point Three = new Point(5.0, 4.0);
    //System.out.println(One.distanceTo(Two));
    //System.out.println(One.equals(Two));
    Triangle First = new Triangle(One, Two, Three);
    System.out.println(First.getPerimeter());
    System.out.println(First.getArea());
  }
}

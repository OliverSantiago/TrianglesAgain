public class PointTester{
  public static void main(String[]args){
    Point One = new Point(2.0,4.0);
    Point Two = new Point(2.0,2.0);
    Point Three = new Point(5.0,4.0);
    Point A = new Point(0.0,0.0);
    Point B = new Point(1,Math.sqrt(3));
    Point C = new Point(2,0);
    //System.out.println(One.distanceTo(Two));
    //System.out.println(One.equals(Two));
    Triangle First = new Triangle(One, Two, Three);
    Triangle Second = new Triangle(A, B, C);
    System.out.println(First.getPerimeter());
    System.out.println(First.getArea());
    System.out.println(First.classify());
    System.out.println(Second.classify());
    System.out.println(First.toString());
    Point Four = new Point(6.0,4.0);
    First.setVertex(3, Four);
    System.out.println(First.toString());
  }
}

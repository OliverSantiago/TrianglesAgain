public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c){
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y2);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }
}

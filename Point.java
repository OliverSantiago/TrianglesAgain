public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    return (Math.sqrt(((other.x-x)*(other.x-x))+((other.y-y)*(other.y-y))));
  }

  public boolean equals(Point other){
    if (other != null && Double.compare(other.x,x)==0&&Double.compare(other.y,y)==0){
      return true;
    }
    return false;
  }

}

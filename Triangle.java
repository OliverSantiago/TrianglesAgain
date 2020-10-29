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

  public double getPerimeter(){
    return (v1.distanceTo(v2)+v2.distanceTo(v3)+v3.distanceTo(v1));
  }

  public double getArea(){
    double s = (v1.distanceTo(v2)+v2.distanceTo(v3)+v3.distanceTo(v1))/2;
    return (Math.sqrt(s*(s-v1.distanceTo(v2))*(s-v2.distanceTo(v3))*(s-v3.distanceTo(v1))));
  }

  public String classify(){
    double a = v1.distanceTo(v2);
    a = a*1000;
    a = Math.round(a);
    a = a/1000;
    double b = v2.distanceTo(v3);
    b = b*1000;
    b = Math.round(b);
    b = b/1000;
    double c = v3.distanceTo(v1);
    c = c*1000;
    c = Math.round(c);
    c = c/1000;
    if (a == b && b == c){
      return "equilateral";
    }
    if ((a==b && b!= c)||(b==c && c!=a)||(a==c && c!=b)){
      return "isosceles";
    }
    if (a!=b && a!=c && b!=c){
      return "scalene";
    }
    return ("Error");
  }

  public String toString(){
    String answer = "v1(";
    answer+=Double.toString(v1.getX());
    answer+=",";
    answer+=Double.toString(v1.getY());
    answer+=") v2(";
    answer+=Double.toString(v2.getX());
    answer+=",";
    answer+=Double.toString(v2.getY());
    answer+=") v3(";
    answer+=Double.toString(v3.getX());
    answer+=",";
    answer+=Double.toString(v3.getY());
    answer+=")";
    return answer;
  }
}

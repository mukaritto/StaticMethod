import static java.lang.Math.pow;

public class MathFunctions{
    public static double p1;
    public static double e1;
    public MathFunctions(double p, double e){
        p1 = p;
        e1 = e;

    }

    public void CircleArea(int radius){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public void ePower(double a){
        System.out.println(pow(e1, a));
    }

    public void TriangleArea(int a, int b, int c){
        double area = p1 * a * pow(b, 2) + pow(c, 2);
        System.out.println(area);
    }
}

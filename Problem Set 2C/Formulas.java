import java.util.Scanner;
/**
 * Write a description of class Formulas here.
 *
 * @Jerry You
 * @9/27/2023
 */
public class Formulas {
       
    public Formulas() {
        
    }
    
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double x1 = ( -b + Math.sqrt((b*b)-(4.0*a*c)) ) / (2.0 * a);
        double x2 = ( -b - Math.sqrt((b*b)-(4.0*a*c)) ) / (2.0 * a);
        
        OrderedPair answer = new OrderedPair(x1 , x2);
        return answer;
        }
    
    public static double findSlope (OrderedPair A, OrderedPair B) {
        
        OrderedPair answer = A;
        OrderedPair answer2 = B;
        
        double slope = ( B.getY() - A.getY() / (B.getX() - A.getX()) );
        return slope;
        
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        
        double m1 = (A.getX() + B.getX())/2;
        double m2 = (B.getY() + A.getY())/2;
        
        OrderedPair midPoint = new OrderedPair (m1,m2);
        return midPoint;
        
        
    }
    
    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double x = a;
        double y = d;
        int z = k;
        
        double seriesSum = z/2 * ( 2*x + y*(z - 1));
        
        return seriesSum;
    }

    public static double findGeometricSeriesSum (double a, double r, int k) {
        double x = a;
        double y = r;
        int z = k;
        
        double geometricSum = a* ( (1-Math.pow(y,z))/( 1- y ) );
        
        return geometricSum;
    
    }
    public static int rollDie (int sides) {
        int x = sides;
        
        int y = (int) ((Math.random() * sides) + 1);
        
        return y;
            
    }


}





/**
 * Problem Set 2B: The OrderedPairClass
 * Jerry You
 * Sept 21, 2023
 */

public class OrderedPair {
    
    //Instance Variable
    double x;
    double y;
    
   public OrderedPair(double a, double b) {
        x = a;
        y = b;
        
    }
    
    public OrderedPair() {
        x = 0;
        y = 0;
        
    }
    
     public String toString() {
        return (x+","+y);
        
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}


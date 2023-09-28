import java.util.Scanner;
 

public class FormulaDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double slope, sumArithmetic;
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for " +a +  "x^2 + " + b + "x + " + c + " are:"  + roots);
        
        
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        OrderedPair A = new OrderedPair(x1,y1);
        OrderedPair B = new OrderedPair(x2,y2);
        slope = Formulas.findSlope(A,B);
        System.out.println("A line between (" + A + ") and (" + B + ") has a slope of " + slope);
        
                
        System.out.print("x1: ");
        double mx1 = input.nextDouble();
        System.out.print("y1: ");
        double my1 = input.nextDouble();
        System.out.print("x2: ");
        double mx2 = input.nextDouble();
        System.out.print("y2: ");
        double my2 = input.nextDouble(); 
        
        
        OrderedPair C = new OrderedPair(mx1,my1);
        OrderedPair D = new OrderedPair(mx2,my2);
        OrderedPair midPoint = Formulas.findMidpoint(C,D);
        System.out.println("The midpoint between (" + C + ") and (" + D + ") is (" + midPoint + ")");
        
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double l = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble(); 
        
        sumArithmetic = Formulas.findArithmeticSeriesSum(a,d,k);
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with " + l + " and increases by " + d + " is " + sumArithmetic);
        
        System.out.print("Number of terms: ");
        int m = input.nextInt();
        System.out.print("Starts with: ");
        double n = input.nextDouble();
        System.out.print("Rate of Growth: ");
        double o = input.nextDouble(); 
        
        double sumGeometric = Formulas.findGeometricSeriesSum(n,o,m);
        System.out.println("The sum of the first " + m + " terms of a finite geometric series that starts with " + n + " and increases by a rate of " + o + " is " + sumGeometric);

       
        System.out.print("How many sides does your die have? ");
        int v = input.nextInt();
        
        int die = Formulas.rollDie(v);
        System.out.println("Rolling a " + v + " -sided die... you got a " + die + "!");
        
        
        
 
    
        
    }
}

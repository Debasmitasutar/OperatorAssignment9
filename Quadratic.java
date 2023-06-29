package Operators;

public class Quadratic {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=3;
        double root1=(-b+Math.sqrt(Math.pow (b,2))-4*a*c)/2*a;
        double root2=(-b-Math.sqrt(Math.pow (b,2))-4*a*c)/2*a;
        System.out.println("The value of 1st root: "+root1);
        System.out.println("The value of 2nd root: "+root2);
    }
}

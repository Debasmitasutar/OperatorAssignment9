package Operators;

public class Distance {
    public static void main(String[] args) {
        if(args.length>2){
            System.out.println("Take two integer command line argument x and y.");
            return;
        }
        int x= Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        //double dis=Math.sqrt((x*x)+(y*y)); //square root will be decimal number so taken double datatype
        double dis=Math.sqrt((Math.pow(x,2))+(Math.pow(y,2))); // using math.pow function.
        System.out.println("Distance between two point is-:" +dis);


    }
}

package Operators;

public class MaxandMin {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=34;
        int d=a+b*c;
        int e=c+a/b;
        int f=a%b+c;
        int g=a*b+c;
        System.out.println("Max value:"+Math.max((Math.max((Math.max(d,e)),f)),g));
        System.out.println("Min value:"+Math.min((Math.min((Math.min(d,e)),f)),g));
    }
}

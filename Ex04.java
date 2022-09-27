// Java program to find out the average of a set of integers (set can be 3 to 6 digits long)

public class Main {
    public static void main(String[] args) {
        System.out.println(average(5,10,15,20,25,30));
        System.out.println(average(5,10,15,20,25));
        System.out.println(average(5,10,15,20));
        System.out.println(average(5,10,15));
        }
   }
   
    static double average(double a, double b, double c, double d, double e, double f){
        return (a+b+c+d+e+f)/6;
    }
    static double average(double a, double b, double c, double d, double e){
        return (a+b+c+d+e)/5;
    }
    static double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }
    static double average(double a, double b, double c) {
        return (a + b + c ) / 3;
    }

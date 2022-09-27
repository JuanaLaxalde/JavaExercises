// Java program to convert the temperature in Degree Centigrade to Fahrenheit

public class Main {
    public static void main(String[] args) {
        System.out.println("C TO F");
        System.out.println(centToFahrenheit(32));
    }
}

public static double centToFahrenheit(double a){
        return (a * 9/5) + 32;
    }

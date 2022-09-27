// Java program to find the area of a triangle whose three sides are given

public class Main {
    public static void main(String[] args) {
        System.out.println(areaOfTrian(10,12,16));
    }
}
public static double areaOfTrian (double a, double b, double c){
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.sort(Comparator.naturalOrder());
        double result = (arr.get(0)*arr.get(1))*0.5;
        return result;
    }

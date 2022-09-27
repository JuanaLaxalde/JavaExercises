  // Java program to find the circumference and area of a circle with a given radius
public class Main {
    public static void main(String[] args) {       
        System.out.println("CIRCLE");
        circArea(4.3);
    }
}

  static void circArea(double radius){
        System.out.println("The circumference is: "+(2*3.14*radius));
        System.out.println("The area is: "+3.14*(radius*radius));
    }

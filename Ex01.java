// Java program to check whether the given number is even or odd

public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(7));
        }
    }
    
    public static boolean isEven(int a){
        double result = a % 2;
        if (result==0){
            return true;
        } else return false;
    }

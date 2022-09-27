// Java program to check whether the given integer is a multiple of 5

public class Main {
    public static void main(String[] args) {
        System.out.println(multipleOfFive(55));
    }
}
    static boolean multipleOfFive(int a){
        if ((a%5)==0){
            return true;
        } else return false;
    }

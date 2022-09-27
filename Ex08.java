// Java program to check whether the given integer is a multiple of both 5 and 7

public class Main {
    public static void main(String[] args) {
        System.out.println(multipleOf57(35));
    }
}

static boolean multipleOf57(int a){
        if ((a%5) ==0 && (a%7)==0){
            return true;
        } else return false;
    }

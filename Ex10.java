// Java program to display all the multiples of 3 within the range 10 to 50

public class Main {
    public static void main(String[] args) {
      
        int number = 50;

        for (int i = 10; i<=number; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}

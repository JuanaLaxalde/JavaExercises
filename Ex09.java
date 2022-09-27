 // Java program to find the sum of the digits of an integer using while loop

public class Main {
    public static void main(String[] args) {
      
        Scanner skan = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = skan.nextInt();
        int sum = 0;

        while (num != 0){
            int digit = num%10;          //> Reminder of num divided by 10 == last digit
            sum = sum+digit;
            num = num/10;                // Number divided by 10 removes last digit
        }
        System.out.println(sum);
    }
}

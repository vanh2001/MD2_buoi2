import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean check = true;
        if(number < 2){
            check = true;
//            System.out.printf("%d is NOT a prime" + number);
        }else {
            int i = 2;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }
        if(check){
            System.out.printf("%d is a prime", number);
        }else {
            System.out.printf("%d is NOT a prime", number);
        }
    }
}

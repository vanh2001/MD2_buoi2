import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nhập vào từ bàn phím 2 số a và b
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();

        //Cách 1: Trừ 2 số khác nhau đến khi nào 2 số bằng nhau
        //Sử dụng hàm trị tuyệt đối để lấy phần dương của a và b
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }else {
            while (a != b){
                if (a > b){
                    a -= b;
                }else {
                    b -= a;
                }
            }
            System.out.println("Greatest common factor: " + a);
        }

        //Cách 2: Vòng lặp đi từ 1 đến số nhỏ nhất nếu cả 2 chia hết thì gán UCLN cho số đó
        int min;
        int UCLN = 0;
        min = Math.min(a,b);
        if (min > 0){
            for (int i = 1; i <= min; i++) {
                if(a % i ==0 && b % i == 0){
                    UCLN = i;
                }
            }
            System.out.println("Greatest common factor: " + UCLN);
        }else {
            System.out.println("No greatest common factor");
        }

    }
}

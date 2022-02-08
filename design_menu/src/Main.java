import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle (In hình chữ nhật)");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) (In hình tam giác vuông)");
            System.out.println("3. Print isosceles triangle (In hình tam giác cân)");
            System.out.println("0. Exit Program!");
            System.out.print("Choice the program: ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Exit Program!");
                    System.exit(0);
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i <= 3; i++) {
                        for (int j = 0; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hình tam giác vuông góc dưới bên trái");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Hình tam giác vuông góc trên bên trái");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Hình tam giác vuông góc trên bên phải");
                    for (int i =0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=5 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Hình tam giác vuông góc dưới bên phải");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hình tam giác cân");
                    int k=0;
                    for (int i = 1; i <= 4; ++i, k = 0) {
                        for (int j = 1; j <= 4 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2*i-1){
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("No Choice!");
            }
        }
    }
}

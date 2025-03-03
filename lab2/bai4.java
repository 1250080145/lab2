package lab2;

import java.util.Scanner;
 class xe {
     private String tenchuxe;
     private String loaixe;
     private int dungtich;
     private double trigia;


     public xe(String tenchuxe, String loaixe, int dungtich, double trigia) {
         this.tenchuxe = tenchuxe;
         this.loaixe = loaixe;
         this.dungtich = dungtich;
         this.trigia = trigia;
     }


     public double tinhthue() {
         if (dungtich < 100)
             return trigia * 0.01;
         else if (dungtich <= 200)
             return trigia * 0.03;
         else
             return trigia * 0.05;
     }


     public void xuatThongTin() {
         System.out.printf("%-20s %-15s %-10d %15.2f %15.2f\n", tenchuxe, loaixe, dungtich, trigia, tinhthue());
     }
 }

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        xe[] danhSachXe = new xe[3];

        for (int i = 0; i < danhSachXe.length; i++) {
            System.out.println("Nhập thông tin xe thứ " + (i + 1) + ":");
            System.out.print("Tên chủ xe: ");
            String tenchuxe = scanner.nextLine();
            System.out.print("Loại xe: ");
            String loaixe = scanner.nextLine();
            System.out.print("Dung tích xy lanh: ");
            int dungtich = scanner.nextInt();
            System.out.print("Trị giá xe: ");
            double trigia = scanner.nextDouble();
            scanner.nextLine();

            danhSachXe[i] = new xe(tenchuxe, loaixe, dungtich, trigia);
        }

        System.out.printf("%-20s %-15s %-10s %15s %15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("--------------------------------------------------------------------------------");
        for (xe xe : danhSachXe) {
            xe.xuatThongTin();
        }

        scanner.close();
    }
}

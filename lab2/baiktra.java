package lab2;
import java.util.Scanner;
class sinhvien {

    private String mssv;
    private String hoten;
    private String diachi;
    private String sdt;

    public sinhvien() {
    }

    public sinhvien(String mssv, String hoten, String diachi, String sdt) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getmssv() {
        return mssv;
    }

    public void setmssv(String mssv) {
        this.mssv = mssv;
    }

    public String gethoten() {
        return hoten;
    }

    @Override
    public String toString() {
        return mssv + " " + hoten + " " + diachi + " " + sdt;
    }
}
    public class baiktra {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);

            System.out.println("Nhap n sinh vien: ");
            int n = kb.nextInt();

            sinhvien[] danhsach = new sinhvien[n];
            for (int i=0; i<n; i++) {
                System.out.println("nhap thong tin sinh vien " + (i + 1) + ": ");
                System.out.print("nhap mssv: ");
                String mssv = kb.nextLine();
                System.out.println("nhap ho ten: ");
                String hoten = kb.nextLine();
                System.out.println("nhap dia chi: ");
                String diachi = kb.nextLine();
                System.out.println("nhao so dien thoai: ");
                String sdt= kb.nextLine();

                danhsach[i] = new sinhvien(mssv, hoten, diachi, sdt);
            }


            System.out.println("\nDanh sách sinh viên:");
            System.out.println("MSSV | Họ tên | Địa chỉ | SĐT");
            for (sinhvien sv : danhsach) {
                System.out.println(sv);
            }

        }
    }


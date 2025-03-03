import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String hoten;
    private float diemlt;
    private float diemth;

    public SinhVien() {
        this.maSV = 0;
        this.hoten = "";
        this.diemlt = 0;
        this.diemth = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemlt, float diemth) {
        this.maSV = maSV;
        this.hoten = hoTen;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public int getMaSV() {
        return maSV;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getHoten() {
        return hoten;
    }

    public void setdiemlt(float diemlt) {
        this.diemlt = diemlt;
    }

    public float getdiemlt() {
        return diemlt;
    }

    public void setdiemth(float diemth) {
        this.diemth = diemth;
    }
    public float getdiemth() {
        return diemth;
    }


    public float tinhdiemtb() {
        return (diemlt +diemth)/2;
    }

    @Override
    public String toString() {
        return String.format("%-8d %-20s %-8.2f %-8.2f %-8.2f", maSV, hoten, diemlt, diemth, tinhdiemtb());
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);
        SinhVien sv2 = new SinhVien(22222, "Lê Thị Bông", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhập mã số của sinh viên sv3: ");
        sv3.setMaSV(kb.nextInt());
        kb.nextLine();

        System.out.print("Nhập họ và tên của sinh viên sv3: ");
        sv3.setHoten(kb.nextLine());

        System.out.print("Nhập điểm lý thuyết của sinh viên sv3: ");
        sv3.setdiemlt(kb.nextFloat());

        System.out.print("Nhập điểm thực hành của sinh viên sv3: ");
        sv3.setdiemth(kb.nextFloat());


        System.out.println("masv     hoten               diemlt   diemth   diemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}

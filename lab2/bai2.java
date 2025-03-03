import java.util.Scanner;

public class bai2 {
    static class hinhchunhat {
        private double chieudai;
        private double chieurong;

        public hinhchunhat(double chieudai,double chieurong) {
            this.chieudai= chieudai;
            this.chieurong = chieurong;
        }

        public void setchieudai(double chieudai) {
            this.chieudai = chieudai;
        }

        public double getchieudai() {
            return chieudai;
        }

        public void setchieurong(double chieurong) {
            this.chieurong = chieurong;
        }

        public double getchieurong() {
            return chieurong;
        }

        public void tinhdientich() {
            double dientich = chieudai*chieurong;
            System.out.println("dien tich: " + dientich);
        }

        public void tinhchuvi() {
            double chuvi =2*(chieudai+chieurong);
            System.out.println("chu vi: " + chuvi);
        }

        public void hienthiramanhinh() {
            System.out.println("HCN co:");
            System.out.println("chieu dai: " + chieudai);
            System.out.println("chieu rong: " + chieurong);

            tinhdientich();
            tinhchuvi();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("nhap chieu rong: ");
        double rong = scanner.nextDouble();

        hinhchunhat hcn = new hinhchunhat(dai, rong);
        hcn.hienthiramanhinh();
    }
}

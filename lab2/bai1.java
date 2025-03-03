package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class bai1 {

    public static int timsonguyen(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void sapXepMang(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        System.out.print("Nhap so luong phan tu: ");
        int a = kb.nextInt();

        int[] array = new int[a];


        for (int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu so " + i + ": ");
            array[i] = kb.nextInt();
        }


        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.print("Nhap so nguyen can tim: ");
        int x = kb.nextInt();
        int so = timsonguyen(array, x);
        if (so != -1) {
            System.out.println("So nguyen can tim nam o vi tri: " + so);
        } else {
            System.out.println("Khong co trong mang");
        }

        int max = array[0];
        int min = array[0];
        int vitrilonnhat = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                vitrilonnhat = i;
            }
            if (array[i] < min) {
                min = array[i];
            }
        }


        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("Gia tri nho nhat trong mang: " + min);
        System.out.println("vi tri cua phan tu lon nhat: " + vitrilonnhat);

        sapXepMang(array);
        System.out.println("mang sau khi sap xep: ");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySoPhuc quanLySoPhuc = new QuanLySoPhuc();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 2 để chọn Menu:");
                System.out.println("1: Nhập so phuc");
                System.out.println("2: Xuat so phuc");
                System.out.println("3: Tru so phuc");
                System.out.println("4: Chia so phuc");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 5) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhap so phuc");
                    System.out.println("Nhap phan thuc");
                    Scanner scPhanThuc = new Scanner(System.in);
                    double phanThuc = scPhanThuc.nextDouble();
                    System.out.println("Nhap phan ao");
                    Scanner scPhanAo = new Scanner(System.in);
                    double phanAo = scPhanAo.nextDouble();
                    quanLySoPhuc.NhapVaoSoPhuc(phanThuc, phanAo);
                } else if (nhap == 2) {
                    System.out.println("Xuat so phuc");
                    quanLySoPhuc.HienThiSoPhuc();
                } else if (nhap == 3) {
                    System.out.println("Tru so phuc");
                    System.out.println("Nhap so phuc thu 2");
                    System.out.println("Nhap phan thuc");
                    Scanner scPhanThuc = new Scanner(System.in);
                    double phanThuc = scPhanThuc.nextDouble();
                    System.out.println("Nhap phan ao");
                    Scanner scPhanAo = new Scanner(System.in);
                    double phanAo = scPhanAo.nextDouble();
                    quanLySoPhuc.TruSoPhuc(new SoPhuc(phanThuc, phanAo)).XuatSoPhuc();
                } else if (nhap == 4) {
                    System.out.println("Chia so phuc");
                    System.out.println("Nhap so phuc thu 2");
                    System.out.println("Nhap phan thuc");
                    Scanner scPhanThuc = new Scanner(System.in);
                    double phanThuc = scPhanThuc.nextDouble();
                    System.out.println("Nhap phan ao");
                    Scanner scPhanAo = new Scanner(System.in);
                    double phanAo = scPhanAo.nextDouble();
                    quanLySoPhuc.ChiaSoPhuc(new SoPhuc(phanThuc, phanAo)).XuatSoPhuc();
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 5);
    }
}
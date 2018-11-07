
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bai4();
    }

    public static void bai1() {
        int diem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diem cua 1 sinh vien:");
        diem = sc.nextInt();
        if (diem < 5)
            System.out.println("hoc lai");
        else if (diem >= 5 && diem < 6)
            System.out.println("Xep loai d");
        else if (diem >= 6 && diem < 7)
            System.out.println("Xep loai C");
        else if (diem >= 7 && diem < 8)
            System.out.println("Xep loai B");
        else if (diem >= 8 && diem < 9)
            System.out.println("Xep loai A");
        else if (diem >= 9 && diem <= 10)
            System.out.println("Xep loai A+ ");
        else if (diem > 10)
            System.out.println("khong hop le");
    }

    public static void bai2() {
        float canNang, tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tuoi cua thanh nien");
        tuoi = sc.nextFloat();
        System.out.println("Nhap can nang cua thanh nien");
        canNang = sc.nextFloat();
        if (tuoi > 18) {
            if (canNang > 50)
                System.out.println("Thanh nien du tuoi hien mau");
        } else
            System.out.println("Thanh nien chua du tuoi hien mau");
    }

    public static void bai4() {
        float chieuCao, tuoi;
        String gioiTinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao gioi tinh ");
        gioiTinh = sc.nextLine();
        System.out.println("Moi nhap vao chieu cao cua ban ");
        chieuCao = sc.nextFloat();
        System.out.println("Moi nhap vao tuoi cua ban");
        tuoi = sc.nextFloat();
        if (chieuCao > 160) {
            switch (gioiTinh) {
                case "nam":
                    ;
                    if (tuoi >= 20 && tuoi <= 29)
                        System.out.println("Chi so can nang tieu chuan cua ban la 62.9 kg");
                    if (tuoi >= 30 && tuoi <= 39)
                        System.out.println("Chi so can nang tieu chuan cua ban la 69.4 kg");
                    if (tuoi >= 40 && tuoi <= 49)
                        System.out.println("Chi so can nang tieu chuan cua ban la 73.3 kg");
                    if (tuoi >= 50)
                        System.out.println("Ban da qua gia toi khong doan duoc suc khoe cua ban");
                    break;
                case "nu":
                    if (tuoi >= 20 && tuoi <= 29)
                        System.out.println("Chi so can nang tieu chuan cua ban la 59.8");
                    if (tuoi >= 30 && tuoi <= 39)
                        System.out.println("Chi so can nag tieu chuan cua ban la 65.8");
                    if (tuoi >= 40 && tuoi <= 49)
                        System.out.println("Chi so can nang tieu chuan cua ban la 69.9");
                    if (tuoi >= 50)
                        System.out.println("Ban da qua gia toi khong the tinh duoc ban");
                    break;
            }
        }
        if(chieuCao<160)
            System.out.println("Ban chua du chieu cao, toi nghi ban nen uong sua chieu cao");
        }
    }


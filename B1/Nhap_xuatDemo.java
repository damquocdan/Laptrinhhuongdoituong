package B1;

import java.util.Scanner;

/**
 * Nhap_xuatDemo
 */
public class Nhap_xuatDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//tạo  ra một đối tượng Scanner. để nhận dữ liệu từ bàn phím
        System.out.print("Moi ban nhap ten: ");//xuất kết quả ra màn hình nhưng con trỏ chuột không xuống dòng
        String name = sc.nextLine();// khai báo một biến để lưu giá trị cho người dùng nhập vào nextLine chuỗi string
        System.out.print("Moi ban nhap tuoi: ");
        int old=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap que quan:");
        String add=sc.nextLine();
        System.out.printf("Chao ban %s %d tuoi Que quan %s", name,old,add);// Xuất ra màn hình kết quả đồng thời có thể định dạng được kết quả đó nhờ vào các đối số thích hợp .%d số nguyên
        
    }
}
package B1;

import java.util.Scanner;

/**
 * TinhScv
 */
public class TinhScv {


  

    public static float main(String[] args) {
        float soDoDoan1, soDoDoan2, soDoDoan3, chuVi, dienTich;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số đo đoạn thẳng thứ nhất: ");
        soDoDoan1 = scanner.nextFloat();
        System.out.println("Nhập vào số đo đoạn thẳng thứ hai: ");
        soDoDoan2 = scanner.nextFloat();
        System.out.println("Nhập vào số đo đoạn thẳng thứ ba: ");
        soDoDoan3 = scanner.nextFloat();
         
        float p=(float)(soDoDoan1+soDoDoan2+soDoDoan3)/2;
        
        float sd=(float)Math.sqrt(p*(p-soDoDoan1)*(p-soDoDoan2)*(p-soDoDoan3));
        
        System.out.println("Dien tich của tam giác bằng = " + sd );
        
        if ((soDoDoan1 + soDoDoan2 > soDoDoan3) && (soDoDoan1 + soDoDoan3 > soDoDoan2) 
            && (soDoDoan2 + soDoDoan3 > soDoDoan1)) {
            // Thỏa mãn điều kiện tạo thành một tam giác
            // Tính chu vi của tam giác bằng tổng số đo 3 cạnh
            chuVi = soDoDoan1 + soDoDoan2 + soDoDoan3;
            System.out.println("Chu vi của tam giác bằng = " + chuVi);
            
          
        } else {
            System.out.println("Không tồn tại tam giác");
        }
    }
}
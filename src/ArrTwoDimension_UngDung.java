import java.util.Scanner;

public class ArrTwoDimension_UngDung {
    public static void main(String[] args) {
        //nhap so dong va so cot cua mang 2 chieu so nguyen
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng");
        int row= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng");
        int col=Integer.parseInt(scanner.nextLine());
        //khai báo và khởi tạo mảng số nguyên 2 chiều
        int [][] arrInt= new int[row][col];
        do{
        //Hiển thị menu và thực hiện chúc năng
        System.out.println("*****************MENU******************");
        System.out.println("1. Nhập giá trị các phần tử của mảng");
        System.out.println("2. In giá trị các phần tử của mảng");
        System.out.println("3.Tính tổng các phần tử của mảng");
        System.out.println("4. Tìm giá trị nhỏ nhất và lớn nhất của mảng");
        System.out.println("5. Thoát");
        System.out.println("****************************************");
        int choice= Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào số tương ứng các chức năng");

        switch (choice){
            case 1:
                System.out.println("1. Nhập giá trị các phần tử của mảng");
                for (int i = 0; i < row; i++) {//row
                    for (int j = 0; j < col; j++) {//col
                        System.out.printf("ArrInt[%d][%d]= ", i, j);
                        arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                    }
                }
                break;
            case 2:
                System.out.println("2. In giá trị các phần tử của mảng");
                for(int i=0;i<row;i++){//row
                    for(int j=0;j<col;j++){//col
                        System.out.printf("%5d" , arrInt[i][j]);
                    }
                    System.out.println("\n");
                }
                System.out.println("\n");
                break;
            case 3:
                System.out.println("3.Tính tổng các phần tử của mảng");
                int sum =0;
                for(int i=0;i<row;i++){ //row
                    for (int j=0;j<col;j++){ //col
                       sum+=arrInt[i][j];
                    }
                }
                System.out.println("Tổng các phần tử của mảng là: " + sum);
                break;
            case 4:
                System.out.println("4. Tìm giá trị nhỏ nhất và lớn nhất của mảng");
                int min=arrInt[0][0];
                int max=arrInt[0][0];
                for(int i=0;i<row;i++){ //row
                    for (int j=0;j<col;j++){ //col
                        if(arrInt[i][j]<min){
                            min=arrInt[i][j];
                        }
                        if(arrInt[i][j]>max){
                            max=arrInt[i][j];
                        }
                    }
                }
                System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
                System.out.println("Giá trị lớn nhất của mảng là: " + max);
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Số bạn nhập không hợp lệ, vui lòng chọn lại.");
                break;
        }
        }while (true);
    }
}

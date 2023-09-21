import java.util.Arrays;
import java.util.Scanner;

public class Exercies_2 {
    public static void main(String[] args) {
        /*
        * a. Nhập số dòng(row) và số cột(col) của mảng 2 chiều và khai báo, khởi tạo mảng 2 chiều số nguyên gồm row dòng và col cột
            b. Hiển thị menu và thực hiện các chức năng theo menu sau: ***********************MENU************************
            1. Nhập giá trị các phần tử mảng 2 chiều
            2. In giá trị các phần tử theo ma trận
            3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng
            4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và
            tính tổng
            5. In ra giá trị lớn nhất và nhỏ nhất trong mảng
            6. Sắp xếp mảng tăng dần theo cột
            7. Thoát
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        //khởi tạo mảng 2 chiều số nguyên
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("***********************MENU***********************");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("*****************************************************");
            System.out.println("Mời bạn nhập vào số muốn thực hiện chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            //vị trí hiện tại của i,j trong mảng
                            System.out.printf("arrInt[%d][%d]= ", i, j);
                            //  //nhập giá trị và gán giá trị đó vào mảng arrInt tại vị trí i,j.
                            arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("2. In giá trị các phần tử theo ma trận");
                    for (int i = 0; i < row; i++) { //row-1
                        for (int j = 0; j < col; j++) { // col-1
                            System.out.print(arrInt[i][j] + "\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
                    int sumBorder = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            //kiểm tra xem phần tử ở dòng i hoặc cột j có nằm trên đường biên của ma trận không
                            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                                System.out.print(arrInt[i][j] + "\t");
                                sumBorder += arrInt[i][j];
                            }
                        }
                        System.out.println("\n");
                    }
                    System.out.println("Tổng các phần tử nằm trên đường biên: " + sumBorder);
                    break;
                case 4:
                    System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
                    int sumCheoChinh = 0; //nối từ góc trên bên trái đến góc dưới bên phải
                    int sumCheoPhu = 0; //góc trên bên phải đến góc dưới bên trái
                    if (row == col) {
                        for (int i = 0, j = row - 1; i < row; i++, j--) {
                            sumCheoChinh += arrInt[i][i]; //cheo chinh
                            sumCheoPhu += arrInt[i][j]; //cheo phu
                        }
                        System.out.println("Tổng đường chéo chính = " + sumCheoChinh);
                        System.out.println("Tổng đường chéo phụ = " + sumCheoPhu);
                    }

                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
                    int min = 0;
                    int max = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arrInt[i][j] < min) {
                                min = arrInt[i][j];
                            }
                            if (arrInt[i][j] > max) {
                                max = arrInt[i][j];
                            }
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
                    System.out.println("Giá trị lớn nhất của mảng là: " + max);
                    break;
                case 6:
                    System.out.println("6. Sắp xếp mảng tăng dần theo cột");
                    for (int j = 0; j < col; j++) {
                        //duyệt từng cột
                        for (int i = 0; i < row - 1; i++) {
                            for (int k = i + 1; k < row; k++) {
                                if (arrInt[i][j] > arrInt[k][j]) {
                                    int temp = arrInt[i][j];
                                    arrInt[i][j] = arrInt[k][j];
                                    arrInt[k][j] = temp;
                                }

                            }

                        }
                    }

                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Số bạn nhập không hợp lệ, vui lòng chọn lại.");

            }
        } while (true);
    }
}

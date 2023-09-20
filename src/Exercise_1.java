import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        /*
        *   a. Nhập số phần tử của mảng(n)vàkhaibáo,khởitạomảngsốnguyên gồm n phần tử
            b. Hiển thị menu và thực hiện các chức năng theo menu sau:
            *  **********************MENU************************
            1. Nhập giá trị các phần tử mảng
            2. Hiển thị giá trị các phần tử mảng
            3. In các phần tử giá trị chẵn trong mảng và tính tổng
            4. In các phần tử có giá trị là số nguyên tố và tính tổng
            5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng
            6. Sắp xếp mảng giảm dần
            7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao
            nhiêu phần tử có giá trị là m
            8. Thoát
          */

        Scanner scanner = new Scanner(System.in);
        //nhập số phần tử của mảng từ bàn phím
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        //khởi tạo mảng số nguyên arrInt có kích thước bằng n
        int[] arrInt = new int[n];
        do {
            //hiển thị menu
            System.out.println("*************MENU***************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao\n" +
                    "            nhiêu phần tử có giá trị là m");
            System.out.println("8. Thoát");
            System.out.println("************************************");
            System.out.println("Mời bạn nhập vào số muốn thực hiện chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử mảng");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("arrInt[%d] = ", i); //thông báo với vị trí hiện tại của i trong mảng
                        //nhập giá trị từ người dùng và gán giá trị đó vào mảng arrInt tại vị trí i.
                        arrInt[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("2. Hiển thị giá trị các phần tử mảng");
                    for (int element : arrInt) {
                        //n giá trị của mỗi phần tử trong mảng (biến element)
                        //%d được sử dụng để in ra một số nguyên
                        //\t thêm vào để tạo một khoảng cách giữa các giá trị
                        System.out.printf("%d\t", element);
                    }
                    // tạo một dòng trống sau khi in xong danh sách các giá trị trong mảng để dễ đọc hơn.
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
                    int sum = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i] % 2 == 0) {
                            sum += arrInt[i];
                            System.out.printf("%d\t ", arrInt[i]);
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Tổng số chẳn trong mảng = " + sum);
                    break;
                case 4:
                    System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
                    int s = 0;
                    for (int element : arrInt) {
                        boolean isPrime = true;
                        if (element <= 1) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(element); j++) {
                                if (element % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.print(element + " ");
                                s += element;
                            }
                        }
                    }
                    System.out.println("\nTổng số nguyên tố trong mảng = " + s);
                    break;
                case 5:
                    System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
                    int min = arrInt[0];
                    int max = arrInt[0];
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i] < min) {
                            min = arrInt[i];
                        }
                        if (arrInt[i] > max) {
                            max = arrInt[i];
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
                    System.out.println("Giá trị lớn nhất của mảng là: " + max);
                    break;
                case 6:
                    System.out.println("6. Sắp xếp mảng giảm dần");
                    for (int i = 0; i < arrInt.length - 1; i++) {
                        for (int j = i + 1; j < arrInt.length; j++) {
                            if (arrInt[i] < arrInt[j]) {
                                int temp = arrInt[j];
                                arrInt[j] = arrInt[i];
                                arrInt[i] = temp;

                            }
                        }
                    }
                    System.out.println("Sắp xếp mảng giảm dần");
                    break;
                case 7:
                    System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao\n" +
                            "nhiêu phần tử có giá trị là m");

                    int m =Integer.parseInt(scanner.nextLine());
                    int count=0;
                    for(int element :arrInt){
                        if(element==m){
                            count ++;
                        }
                    }
                    System.out.println("Trong mảng có " + count + " phần tử có giá trị " + m);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Số bạn nhập không hợp lệ, vui lòng chọn lại.");
            }

        } while (true);

    }
}

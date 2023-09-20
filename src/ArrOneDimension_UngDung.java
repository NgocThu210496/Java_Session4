import java.util.Scanner;

public class ArrOneDimension_UngDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap so phan tu cua mang tu ban phim
        System.out.println("Nhập số phần tử của mảng");
        int arrSize = Integer.parseInt(scanner.nextLine());
        //khai bao mang so nguyen
        int[] arrInt = new int[arrSize];
        do {
            System.out.println("*****************MENU********************");
            System.out.println("1. nhap gia tri cac phan tu mang");
            System.out.println("2.In ra gia tri cac phan tu cua mang");
            System.out.println("3.In ra so chan trong mang");
            System.out.println("4.In ra gia tri phan tu co chi so le");
            System.out.println("5. tinh tong phan tu trong mang");
            System.out.println("6. Sắp xếp mảng tăng dần (thuật toán selection sort)");
            System.out.println("7.Thoat");
            System.out.println("Moi ban nhap so chuc nang");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap gia tri cac phan tu mang");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.println("1. nhap gia tri cac phan tu mang" + (i + 1));
                        arrInt[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("2.In ra gia tri cac phan tu cua mang");
                    for (int element : arrInt) {
                        System.out.print(element + " ");
                    }
                    System.out.println();

                    break;
                case 3:

                    System.out.print("In ra so chan trong mang ");
                    for (int element : arrInt) {
                        if (element % 2 == 0) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4.In ra gia tri phan tu co chi so le");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (i % 2 != 0) {
                            System.out.print(arrInt[i] + " ");
                        }
                    }
                    System.out.println();
                case 5:
                    System.out.println("5. tinh tong phan tu trong mang");
                    int sum = 0;
                    for (int e : arrInt) {
                        sum += e;
                    }
                    System.out.println("Tong mang ArrInt = " + sum);
                    break;
                case 6:
                    System.out.println("6. Sap xep tang dan");
                    for (int i = 0; i < arrInt.length - 1; i++) {
                        for (int j = i + 1; j < arrInt.length; j++) {
                            if (arrInt[i] > arrInt[j]) {
                                int temp = arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep tang dan ");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Số bạn nhập không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        } while (true);

    }
}
